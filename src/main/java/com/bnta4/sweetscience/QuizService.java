package com.bnta4.sweetscience;

import com.bnta4.sweetscience.boxerStyle.BoxerStyle;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private QuizDataAccessService quizDataAccessService;

    public QuizService(QuizDataAccessService quizDataAccessService) {
        this.quizDataAccessService = quizDataAccessService;
    }

    public void addNewAnswer(int question_number, Quiz.Answer answer) {
        quizDataAccessService.insertQuestionAnswer(question_number, answer);
//        if (result != 1) {
//            throw new IllegalStateException("oops something went wrong");
//        }
    }

    public List<> getQuestions
//
//    public Movie getMovie(String movieName) {
//        return movieDataAccessService.selectAllMoviesMovies()

}



