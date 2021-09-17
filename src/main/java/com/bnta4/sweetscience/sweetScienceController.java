package com.bnta4.sweetscience;

import com.bnta4.sweetscience.quiz.Quiz;
import com.bnta4.sweetscience.quiz.QuizDataAccessService;
import com.bnta4.sweetscience.quiz.QuizService;
import com.bnta4.sweetscience.users.Users;
import com.bnta4.sweetscience.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/sweetScience")
public class sweetScienceController {

    private QuizDataAccessService quizDataAccessService;
    private QuizService quizService;

    @Autowired
    private UsersService usersService;

    public sweetScienceController(QuizDataAccessService quizDataAccessService, QuizService quizService) {
        this.quizDataAccessService = quizDataAccessService;
        this.quizService = quizService;
    }

    @GetMapping
    public String sayHello() {
        System.out.println("Hello!");
        return "Hello";

    }

    @GetMapping("question/{number}")
    public Quiz.Question getQuestion(@PathVariable int number) {
        return quizQuestions.get(number - 1);
    }

    @PostMapping ("question/{number}")
    public void userAnswers(@PathVariable int number, @RequestBody Quiz.Answer inputAnswer) {
        quizService.addNewAnswer(number, inputAnswer);
    }

    @GetMapping("quizResult")
    public String getResults(){
        return quizService.getResult();
    }

    @PostMapping("signUp")
    public void signUp(@RequestBody Users newUser) {
        System.out.println(newUser);
        this.usersService.createUser(newUser);
    }
































    private List<Quiz.Question> quizQuestions =
            List.of(
                    new Quiz.Question("Would you rather meditate or pray?", "Q1",
                            List.of(
                                    new Quiz.Answer("Both.", "a"),
                                    new Quiz.Answer("Meditate.", "b"),
                                    new Quiz.Answer("Pray.", "c"),
                                    new Quiz.Answer("I'm more of a deep thinker.", "d")
                            )),

                    new Quiz.Question("How did you spend your last birthday?", "Q2",
                            List.of(
                                    new Quiz.Answer(" I spent it with family.", "a"),
                                    new Quiz.Answer("I spent the day alone.", "b"),
                                    new Quiz.Answer("I spent it with friends.", "c"),
                                    new Quiz.Answer("I spent it at work.", "d")
                            )),
                    new Quiz.Question("Which best describes you?", "Q3",
                            List.of(
                                    new Quiz.Answer("Authentic.", "a"),
                                    new Quiz.Answer("Relaxed.", "b"),
                                    new Quiz.Answer("Driven.", "c"),
                                    new Quiz.Answer("Reliable.", "d")
                            )),

                    new Quiz.Question("How would you build a fire?", "Q4",
                            List.of(
                                    new Quiz.Answer("I would rub two sticks together.", "a"),
                                    new Quiz.Answer("I would use matches.", "b"),
                                    new Quiz.Answer("Gasoline solves everything.", "c"),
                                    new Quiz.Answer("I would use a fire starter.", "d")
                            )),
                    new Quiz.Question("What movie genre do you watch most often?", "Q5",
                            List.of(
                                    new Quiz.Answer("Horror", "a"),
                                    new Quiz.Answer("Rom-Com", "b"),
                                    new Quiz.Answer("Action/Adventure", "c"),
                                    new Quiz.Answer("Documentary", "d")

                            )),
                    new Quiz.Question("What happens to your soul when you die?", "Q6",
                            List.of(
                                    new Quiz.Answer("I believe it goes to heaven.", "a"),
                                    new Quiz.Answer("I believe in reincarnation.", "b"),
                                    new Quiz.Answer("I have no idea.", "c"),
                                    new Quiz.Answer("I hope I get to go to space.", "d")
                            )),
                    new Quiz.Question("Which describes your soul best?", "Q7",
                            List.of(
                                    new Quiz.Answer("Unique", "a"),
                                    new Quiz.Answer("Free", "b"),
                                    new Quiz.Answer("Kind", "c"),
                                    new Quiz.Answer("Old", "d")
                            )));
}




