package com.bnta4.sweetscience;

import com.bnta4.sweetscience.users.Users;
import com.bnta4.sweetscience.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/sweetScience")
public class SweetScienceController {

    private final QuizDataAccessService quizDataAccessService;
    private final QuizService quizService;

    @Autowired
    private UsersService usersService;

    public SweetScienceController(QuizDataAccessService quizDataAccessService, QuizService quizService) {
        this.quizDataAccessService = quizDataAccessService;
        this.quizService = quizService;
    }

    @GetMapping
    public String sayHello() {
        System.out.println("Hello!");
        return "Hello";

    }

    @GetMapping("question/{number}")
    //return throws error when question cannot be found . If it's in the body it's a bad request and if it's in the path its not found 404. It's 500 when you're not handling the error
    public ResponseEntity<Quiz.Question> getQuestion(@PathVariable int number) {
//        return quizQuestions.get(number - 1);
        try {
            return ResponseEntity.ok(QuizDataAccessService.quizQuestions.get(number - 1));
        } catch (IndexOutOfBoundsException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("question/{number}")
    public ResponseEntity userAnswers(@PathVariable int number, @RequestBody Quiz.Answer inputAnswer) {
        if (inputAnswer != null) {


            quizService.addNewAnswer(number, inputAnswer);
            return ResponseEntity.noContent().build(); //response code 204
        } else{
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping("quizResult")
    public String getResults() throws Exception {
        return quizService.getResult();
    }

    @PostMapping("signUp")
    public void signUp(@RequestBody Users newUser) {
        System.out.println(newUser);
        this.usersService.createUser(newUser);
    }
}






