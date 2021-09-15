package com.bnta4.sweetscience;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class QuizDataAccessService {

    private List<Quiz.Question> quizQuestions;
    private Map<String, Integer> answerFrequency;

    public QuizDataAccessService() {

        answerFrequency = new HashMap<>();

        quizQuestions =
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

    public String insertQuestionAnswer(int question_number, Quiz.Answer answer) {

        String LetterCount = new String();
        LetterCount.concat(String.valueOf(answer));
        return LetterCount;
            }

    public String addToHashMap() {
        QuizService.getLetter();
        return
    }

        //reset the arrays for both
        //collect user input
        //store multi value pairs into map
        // Two methods -




//        try {
//            File surveyAnswers = new File("src/main/resources/quiz.txt");
//            FileWriter myWriter = new FileWriter("quiz.txt", true);
//            myWriter.write(question_number + "\n");
//            myWriter.write(answer.getId() + "\n");
//            myWriter.close();
//        } catch (IOException e) {
//            System.out.println("An Error has occurred");
//            e.printStackTrace();
//        }
    }

//    public static List<Quiz.Question> selectQuestions() {
//        return quizQuestions;
//    }
}
// Maps = Key value pairs
//Keep track of
