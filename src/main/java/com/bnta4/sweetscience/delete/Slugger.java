package com.bnta4.sweetscience.delete;

import com.bnta4.sweetscience.boxerStyle.BoxerPerson;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;

import java.util.Objects;

public class Slugger {
    private Elements element;
    private BoxerPerson boxerPerson;
    private TrainingPlan trainingPlan;

    public Slugger(Elements element, BoxerPerson boxerPerson, TrainingPlan trainingPlan) {
        this.element = Elements.EARTH;
        this.boxerPerson = BoxerPerson.SHANNON_COURTENAY;
        this.trainingPlan = TrainingPlan.COURTENAY101;
    }

    public Elements getElement() {
        return element;
    }

    public void setElement(Elements element) {
        this.element = element;
    }

    public BoxerPerson getBoxerPerson() {
        return boxerPerson;
    }

    public void setBoxerPerson(BoxerPerson boxerPerson) {
        this.boxerPerson = boxerPerson;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    @Override
    public String toString() {
        return "Slugger{" +
                "element=" + element +
                ", boxerPerson=" + boxerPerson +
                ", trainingPlan=" + trainingPlan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Slugger)) return false;
        Slugger slugger = (Slugger) o;
        return getElement() == slugger.getElement() && getBoxerPerson() == slugger.getBoxerPerson() && getTrainingPlan() == slugger.getTrainingPlan();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElement(), getBoxerPerson(), getTrainingPlan());
    }
}
