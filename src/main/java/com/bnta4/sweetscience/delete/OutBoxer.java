package com.bnta4.sweetscience.delete;

import com.bnta4.sweetscience.boxerStyle.BoxerPerson;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;

import java.util.Objects;

public class OutBoxer {
    private Elements element;
    private BoxerPerson boxerPerson;
    private TrainingPlan trainingPlan;

    public OutBoxer(Elements element, BoxerPerson boxerPerson, TrainingPlan trainingPlan) {
        this.element = Elements.AIR;
        this.boxerPerson = BoxerPerson.RAMLA_ALI;
        this.trainingPlan = TrainingPlan.ALI101;
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
        if (!(o instanceof OutBoxer)) return false;
        OutBoxer outBoxer = (OutBoxer) o;
        return getElement() == outBoxer.getElement() && getBoxerPerson() == outBoxer.getBoxerPerson() && getTrainingPlan() == outBoxer.getTrainingPlan();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElement(), getBoxerPerson(), getTrainingPlan());
    }

    @Override
    public String toString() {
        return "OutBoxer{" +
                "element=" + element +
                ", boxerPerson=" + boxerPerson +
                ", trainingPlan=" + trainingPlan +
                '}';
    }
}
