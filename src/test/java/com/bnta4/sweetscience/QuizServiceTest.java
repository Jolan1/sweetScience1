package com.bnta4.sweetscience;

import com.bnta4.sweetscience.boxerStyle.BoxerStyle;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;

import static org.junit.jupiter.api.Assertions.*;

class QuizServiceTest {

    @Test
    void addNewAnswer() {
        //given -- an answer
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
//        Mockito.when(quizDataAccessService.insertQuestionAnswer(any(),any())).
        QuizService quizService = new QuizService(mockedDataAccessService);
        Quiz.Answer testAnswer = new Quiz.Answer("Both", "a");

        //when --add new answer
        quizService.addNewAnswer(1, testAnswer);

        //then -- then answer is inserted into dataAccessService
        Mockito.verify(mockedDataAccessService,Mockito.times(1)).insertQuestionAnswer(1, testAnswer);
    }

    @Test
    void givenNoAnswersAreRecordedWhenIGetResultsThenAnErrorShouldBeThrown() {

        //given no answers are recorded
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        Mockito.when(mockedDataAccessService.getAnswerFrequency()).thenReturn(Collections.emptyMap());
        QuizService quizService = new QuizService(mockedDataAccessService);

        //when i get results
        try{
            String noAnswerResult = quizService.getResult();
            fail("Expected error to be thrown when no answer was provided");
        }
        catch(Exception e) {
            assertEquals("No answers were provided", e.getMessage());
        }

        //then throw an error

    }

    @Test
    void givenAllAnswersWereCalledZeroTimesWhenIGetResults(){
        Map<String,Integer> zeroAnswerMap = new HashMap<>();
        zeroAnswerMap.put("a", 0);
        zeroAnswerMap.put("b", 0);
        zeroAnswerMap.put("c", 0);
        zeroAnswerMap.put("d", 0);
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        Mockito.when(mockedDataAccessService.getAnswerFrequency()).thenReturn(zeroAnswerMap);
        QuizService quizService = new QuizService(mockedDataAccessService);

        //when i get results
        try{
            String noAnswerResult = quizService.getResult();
            fail("Expected error to be thrown when no answer was provided");
        }
        catch(Exception e) {
            assertEquals("No answers were provided", e.getMessage());
        }

    }
    @Test
    void givenAllAnswersWereAWhenIGetResultsThenResultShouldBeWater() throws Exception{
        Map<String,Integer> zeroAnswerMap = new HashMap<>();
        zeroAnswerMap.put("a", 10);
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        Mockito.when(mockedDataAccessService.getAnswerFrequency()).thenReturn(zeroAnswerMap);
        QuizService quizService = new QuizService(mockedDataAccessService);

        //when i get results

        String waterAnswerResult = quizService.getResult();
        assertEquals("Your Results are in:\n" +
                "Personality: WATER (Intuitive, Emotional, Nurturer and Environment-conscious.\n" +
                "Boxing Style: SWARMER\n" +
                "Training Plan: FRAZIER101", waterAnswerResult);
    }
    @Test
    void givenAllAnswersWereBWhenIGetResultsThenResultShouldBeEarth() throws Exception{
        Map<String,Integer> zeroAnswerMap = new HashMap<>();
        zeroAnswerMap.put("b", 10);
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        Mockito.when(mockedDataAccessService.getAnswerFrequency()).thenReturn(zeroAnswerMap);
        QuizService quizService = new QuizService(mockedDataAccessService);

        //when i get results

        String earthAnswerResult = quizService.getResult();
        assertEquals("Your Results are in:\n" +
                "Personality: EARTH (Patient and Practical, Hard Working and Stability seeking.\n" +
                "Boxing Style: BOXER_PUNCHER\n" +
                "Training Plan: TYSON101", earthAnswerResult);
    }
    @Test
    void givenAllAnswersWereCWhenIGetResultsThenResultShouldBeFire() throws Exception{
        Map<String,Integer> zeroAnswerMap = new HashMap<>();
        zeroAnswerMap.put("c", 10);
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        Mockito.when(mockedDataAccessService.getAnswerFrequency()).thenReturn(zeroAnswerMap);
        QuizService quizService = new QuizService(mockedDataAccessService);

        //when i get results

        String fireAnswerResult = quizService.getResult();
        assertEquals("Your Results are in:\n" +
                "Personality: FIRE (Spontaneous, Enthusiastic, Driven, Adventure Seeker and Intuitive.\n" +
                "Boxing Style: SLUGGER\n" +
                "Training Plan: COURTENAY101", fireAnswerResult);
    }

    @Test
    void givenAllAnswersWereDWhenIGetResultsThenResultShouldBeAir() throws Exception{
        Map<String,Integer> zeroAnswerMap = new HashMap<>();
        zeroAnswerMap.put("d", 10);
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        Mockito.when(mockedDataAccessService.getAnswerFrequency()).thenReturn(zeroAnswerMap);
        QuizService quizService = new QuizService(mockedDataAccessService);

        //when i get results

        String airAnswerResult = quizService.getResult();
        assertEquals("Your Results are in:\n" +
                "Personality: AIR (Social, Objective, Communicator and Observer.\n" +
                "Boxing Style: OUT_BOXER\n" +
                "Training Plan: ALI101", airAnswerResult);
    }

    @Test
    void givenAAndDWereCalledEqualTimesWhenIGetResultsThenResultShouldBeAir() throws Exception {
        Map<String, Integer> zeroAnswerMap = new HashMap<>();
        zeroAnswerMap.put("a", 10);
        zeroAnswerMap.put("d", 10);
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        Mockito.when(mockedDataAccessService.getAnswerFrequency()).thenReturn(zeroAnswerMap);
        QuizService quizService = new QuizService(mockedDataAccessService);

        //when i get results

        String waterAnswerResult = quizService.getResult();
        assertEquals("Your Results are in:\n" +
                "Personality: WATER (Intuitive, Emotional, Nurturer and Environment-conscious.\n" +
                "Boxing Style: SWARMER\n" +
                "Training Plan: FRAZIER101", waterAnswerResult);
    }

}