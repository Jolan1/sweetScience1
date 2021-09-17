package com.bnta4.sweetscience;

import com.bnta4.sweetscience.boxerStyle.BoxerStyle;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;
import org.springframework.stereotype.Service;

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

    }

    public String getResult() throws Exception{
        Map<String, Integer> result = quizDataAccessService.getAnswerFrequency();

        int aCount = result.getOrDefault("a", 0); //returns 0 as default
        int bCount = result.getOrDefault("b", 0);
        int cCount = result.getOrDefault("c", 0);
        int dCount = result.getOrDefault("d", 0);

        if(aCount + bCount + cCount + dCount == 0){
            throw new Exception("No answers were provided");
        }
        if (aCount >= bCount && aCount >= cCount && aCount >= dCount) {
            return "Your Results are in:\nPersonality: " + Elements.WATER + " (Intuitive, " +
                    "Emotional, " +
                    "Nurturer " +
                    "and Environment-conscious.\nBoxing Style: " + BoxerStyle.SWARMER +"\nTraining Plan: " + TrainingPlan.FRAZIER101;
        } else if (bCount >= aCount && bCount >= cCount && bCount >= dCount) {
            return "Your Results are in:\nPersonality: " + Elements.EARTH + " (Patient and Practical, " +
                    "Hard Working and Stability seeking.\nBoxing Style: " + BoxerStyle.BOXER_PUNCHER +"\nTraining " +
                    "Plan: " + TrainingPlan.TYSON101;
        } else if (cCount >= aCount && cCount >= bCount && cCount >= dCount) {
            return "Your Results are in:\nPersonality: " + Elements.FIRE + " (Spontaneous, Enthusiastic, " +
                    "Driven, Adventure Seeker and Intuitive.\nBoxing Style: " + BoxerStyle.SLUGGER +"\nTraining " +
                    "Plan: " + TrainingPlan.COURTENAY101;
        } else{
            return "Your Results are in:\nPersonality: " + Elements.AIR + " (Social, Objective, " +
                    "Communicator and Observer.\nBoxing Style: " + BoxerStyle.OUT_BOXER +"\nTraining Plan: " + TrainingPlan.ALI101;
        }
    }
}



