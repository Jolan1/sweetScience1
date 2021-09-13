package com.bnta4.sweetscience.delete;

import com.bnta4.sweetscience.boxerStyle.BoxerPerson;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;

import java.util.Objects;

public class Swarmer {
    private Elements element;
    private BoxerPerson boxerPerson;
    private TrainingPlan trainingPlan;

    public Swarmer(Elements element, BoxerPerson boxerPerson, TrainingPlan trainingPlan) {
        this.element = Elements.WATER;
        this.boxerPerson = BoxerPerson.JOE_FRAZIER;
        this.trainingPlan = TrainingPlan.FRAZIER101;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Swarmer)) return false;
        Swarmer swarmer = (Swarmer) o;
        return getElement() == swarmer.getElement() && getBoxerPerson() == swarmer.getBoxerPerson() && getTrainingPlan() == swarmer.getTrainingPlan();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElement(), getBoxerPerson(), getTrainingPlan());
    }

    @Override
    public String toString() {
        return "SWARMER{" +
                "element=" + element +
                ", boxerPerson=" + boxerPerson +
                ", trainingPlan=" + trainingPlan +
                '}';
    }
}
