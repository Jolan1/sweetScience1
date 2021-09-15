package com.bnta4.sweetscience;

import com.bnta4.sweetscience.boxerStyle.BoxerStyle;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    public class getLetter() {
        public static void characterCount(QuizDataAccessService ){
            Map<String, Integer> answerFrequency = new HashMap<>();
            String[] split = letters.split(",");

            for (String c: split){
                c = c.trim();
                if(answerFrequency.containsKey(c)){
                    answerFrequency.put(c, answerFrequency.get(c)+1);
                } else {
                    answerFrequency.put(c, 1);
                }
            }
            return letters + " : " + answerFrequency);
    }


//    public List<> getQuestions
////
////    public Movie getMovie(String movieName) {
//        return movieDataAccessService.selectAllMoviesMovies()

    }


