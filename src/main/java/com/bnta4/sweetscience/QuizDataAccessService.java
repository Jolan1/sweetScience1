package com.bnta4.sweetscience;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Repository
public class QuizDataAccessService {

    private List<Quiz.Question> quizQuestions;

    public QuizDataAccessService() {

         quizQuestions =
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

    public void insertQuestionAnswer(int question_number, Quiz.Answer answer) {
        try {
            File surveyAnswers = new File("src/main/resources/quiz.txt");
            FileWriter myWriter = new FileWriter("quiz.txt", true);
            myWriter.write(quizQuestions.get(question_number- 1) + "\n");
            myWriter.write(answer.id + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An Error has occurred");
            e.printStackTrace();
        }
    }
}
