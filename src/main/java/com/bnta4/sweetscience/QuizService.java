package com.bnta4.sweetscience;

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
    }}
