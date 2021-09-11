package com.bnta4.sweetscience;

import java.util.List;

public class Quiz {
    public String title;
    public List<Question> questions;

    public Quiz(String title, List<Question> questions) {
        this.title = title;
        this.questions = questions;
    }

    public static class Question {
        public String question;
        public String id;
        public List<Answer> answers;

        public Question(String question, String id, List<Answer> answers) {
            this.question = question;
            this.id = id;
            this.answers = answers;
        }
    }

    public static class Answer {
        public String answer;
        public String id;

        public Answer(String answer, String id) {
            this.answer = answer;
            this.id = id;
        }
    }
}
