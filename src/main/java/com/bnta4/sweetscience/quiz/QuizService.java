package com.bnta4.sweetscience.quiz;

import com.bnta4.sweetscience.boxerStyle.BoxerStyle;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;
import com.bnta4.sweetscience.quiz.Quiz;
import com.bnta4.sweetscience.quiz.QuizDataAccessService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QuizService {

    private QuizDataAccessService quizDataAccessService;

    public QuizService(QuizDataAccessService quizDataAccessService) {
        this.quizDataAccessService = quizDataAccessService;
    }

    public void addNewAnswer(int question_number, Quiz.Answer answer) {
        quizDataAccessService.insertQuestionAnswer(question_number, answer);

    }

    public String getResult(){
        Map<String, Integer> result = quizDataAccessService.getAnswerFrequency();
        int aCount = result.get("a");
        int bCount = result.get("b");
        int cCount = result.get("c");
        int dCount = result.get("d");

        if (aCount > bCount && aCount > cCount && aCount > dCount) {
            return "Your Results are in:\nPersonality: " + Elements.WATER + " (Intuitive, " +
                    "Emotional, " +
                    "Nurturer " +
                    "and Environment-conscious.\nBoxing Style: " + BoxerStyle.SWARMER +"\nTraining Plan: " + TrainingPlan.FRAZIER101;
        } else if (bCount > aCount && bCount > cCount && bCount > dCount) {
            return "Your Results are in:\nPersonality: " + Elements.EARTH + " (Patient and Practical, " +
                    "Hard Working and Stability seeking.\nBoxing Style: " + BoxerStyle.BOXER_PUNCHER +"\nTraining " +
                    "Plan: " + TrainingPlan.TYSON101;
        } else if (cCount > aCount && cCount > bCount && cCount > dCount) {
            return "Your Results are in:\nPersonality: " + Elements.FIRE + " (Spontaneous, Enthusiastic, " +
                    "Driven, Adventure Seeker and Intuitive.\nBoxing Style: " + BoxerStyle.SLUGGER +"\nTraining " +
                    "Plan: " + TrainingPlan.COURTENAY101;
        } else if (dCount > aCount && dCount > bCount && dCount > cCount) {
            return "Your Results are in:\nPersonality: " + Elements.AIR + " (Social, Objective, " +
                    "Communicator and Observer.\nBoxing Style: " + BoxerStyle.OUT_BOXER +"\nTraining Plan: " + TrainingPlan.ALI101;
        }else{
            return "You may have made a mistake! Try again!";
        }
    }
}



