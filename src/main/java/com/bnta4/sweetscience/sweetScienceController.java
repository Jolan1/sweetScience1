package com.bnta4.sweetscience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/sweetScience")
public class sweetScienceController {

    @GetMapping
    public String sayHello() {
        System.out.println("Hello!");
        return "Hello";

    }

    @GetMapping("question/{number}")
    public Quiz.Question getQuestion(@PathVariable int number) {
        return quizQuestions.get(number - 1);
    }

    private List<Quiz.Question> quizQuestions =
            List.of(
                    new Quiz.Question("Would you rather meditate or pray?", "Q1",
                            List.of(
                                    new Quiz.Answer("Both.", "a"),
                                    new Quiz.Answer("Meditate.", "a"),
                                    new Quiz.Answer("Pray.", "b"),
                                    new Quiz.Answer("I'm more of a deep thinker.", "c")
                            )),

                    new Quiz.Question("How did you spend your last birthday?", "Q2",
                            List.of(
                                    new Quiz.Answer(" I spent it with family.", "a"),
                                    new Quiz.Answer("I spent the day alone.", "a"),
                                    new Quiz.Answer("I spent it with friends.", "b"),
                                    new Quiz.Answer("I spent it at work.", "c")
                            )),
                    new Quiz.Question("Which best describes you?", "Q3",
                            List.of(
                                    new Quiz.Answer("Authentic.", "a"),
                                    new Quiz.Answer("Relaxed.", "a"),
                                    new Quiz.Answer("Driven.", "b"),
                                    new Quiz.Answer("Reliable.", "c")
                            )),

                    new Quiz.Question("How would you build a fire?", "Q4",
                            List.of(
                                    new Quiz.Answer("I would rub two sticks together.", "a"),
                                    new Quiz.Answer("I would use matches.", "a"),
                                    new Quiz.Answer("Gasoline solves everything.", "b"),
                                    new Quiz.Answer("I would use a fire starter.", "c")
                            )),
                    new Quiz.Question("What movie genre do you watch most often?", "Q5",
                            List.of(
                                    new Quiz.Answer("Horror", "a"),
                                    new Quiz.Answer("Rom-Com", "a"),
                                    new Quiz.Answer("Action/Adventure", "b"),
                                    new Quiz.Answer("Documentary", "c")

                            )),
                    new Quiz.Question("What happens to your soul when you die?", "Q6",
                            List.of(
                                    new Quiz.Answer("I believe it goes to heaven.", "a"),
                                    new Quiz.Answer("I believe in reincarnation.", "a"),
                                    new Quiz.Answer("I have no idea.", "b"),
                                    new Quiz.Answer("I hope I get to go to space.", "c")
                            )),
                    new Quiz.Question("Which describes your soul best?", "Q7",
                            List.of(
                                    new Quiz.Answer("Unique", "a"),
                                    new Quiz.Answer("Free", "a"),
                                    new Quiz.Answer("Kind", "b"),
                                    new Quiz.Answer("Old", "c")
                            )));
}




