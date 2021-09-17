package com.bnta4.sweetscience.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingPlanTest {

    @Test
    void getId() {
        TrainingPlan test = new TrainingPlan(1L,"","","","","");
        assertEquals(test.getId(),1L);
    }

    @Test
    void getTrainingPlanNumber() {
        TrainingPlan test = new TrainingPlan(1L,"abc123","","","","");
        assertEquals(test.getTrainingPlanNumber(),"abc123");
    }

    @Test
    void getBoxerStyle() {
        TrainingPlan test = new TrainingPlan(1L,"abc123","abc1","","","");
        assertEquals(test.getBoxerStyle(),"abc1");
    }

    @Test
    void getBoxerPerson() {
        TrainingPlan test = new TrainingPlan(1L,"abc123","","abc12","","");
        assertEquals(test.getBoxerPerson(),"abc12");
    }

    @Test
    void getElement() {
        TrainingPlan test = new TrainingPlan(1L,"abc123","","","abc1234","");
        assertEquals(test.getElement(),"abc1234");
    }

    @Test
    void getWorkOut() {
        TrainingPlan test = new TrainingPlan(1L,"abc123","","","","abc12345");
        assertEquals(test.getWorkOut(),"abc12345");
    }
}