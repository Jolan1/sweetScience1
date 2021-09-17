package com.bnta4.sweetscience;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;



class SweetScienceControllerTest {

    @Test
    void sayHello() {
        //given SweetScienceController
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        QuizService mockedQuizService = Mockito.mock(QuizService.class);
        SweetScienceController sweetScienceController = new SweetScienceController(mockedDataAccessService, mockedQuizService);

        //when I call sayHello
        String helloResult = sweetScienceController.sayHello();

        //then should be given info about app
        assertEquals("Hello", helloResult);
    }

    @Test
    void getQuestion() {
    }

    @Test
    void givenValidAnswerWhenUserProvidesAnswerThenTheAnswerIsAddedToQuizService() {
        //given SweetScienceController
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        QuizService mockedQuizService = Mockito.mock(QuizService.class);
        SweetScienceController sweetScienceController = new SweetScienceController(mockedDataAccessService, mockedQuizService);
        Quiz.Answer testAnswer = new Quiz.Answer("both", "a");
        //when I provide an answer
        ResponseEntity userResponse = sweetScienceController.userAnswers(1, testAnswer);

        //then the answer should be added to quizservice
        assertEquals(userResponse.getStatusCode(), HttpStatus.NO_CONTENT);
        Mockito.verify(mockedQuizService,Mockito.times(1)).addNewAnswer(1, testAnswer);
    }

    @Test
    void givenInvalidAnswerWhenUserProvidesAnswerThenAClientErrorIsReturned() {
        //given SweetScienceController
        QuizDataAccessService mockedDataAccessService = Mockito.mock(QuizDataAccessService.class);
        QuizService mockedQuizService = Mockito.mock(QuizService.class);
        SweetScienceController sweetScienceController = new SweetScienceController(mockedDataAccessService, mockedQuizService);
        //when I provide an answer
        ResponseEntity userResponse = sweetScienceController.userAnswers(1, null);

        //then a client error is returned
        assertEquals(userResponse.getStatusCode(), HttpStatus.BAD_REQUEST);
    }

    @Test
    void getResults() {
    }

    @Test
    void signUp() {
    }
}