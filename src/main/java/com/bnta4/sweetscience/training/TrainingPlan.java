package com.bnta4.sweetscience.training;


import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "TrainingPlan")
@Table(
        name = "training_plan",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "training_plan_number_unique",
                        columnNames = "training_plan_number"
                )
        }
)
public class TrainingPlan {

    @Id
    @SequenceGenerator(
            name = "training_plan_sequence",
            sequenceName = "training_plan_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "training_plan_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "training_plan_number",
            nullable = false,
            length = 10
    )
    private String trainingPlanNumber;

    @Column(
            name = "boxer_style",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String boxerStyle;

    @Column(
            name = "boxer_person",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String boxerPerson;

    @Column(
            name = "element",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String element;

    @Column(
            name = "work_out",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String workOut;

    public Long getId() {
        return id;
    }

    public String getTrainingPlanNumber() {
        return trainingPlanNumber;
    }

    public String getBoxerStyle() {
        return boxerStyle;
    }

    public String getBoxerPerson() {
        return boxerPerson;
    }

    public String getElement() {
        return element;
    }

    public String getWorkOut() {
        return workOut;
    }

    public TrainingPlan() {
    }

    public TrainingPlan(
            String trainingPlanNumber,
            String boxerStyle,
            String boxerPerson,
            String element,
            String workOut) {
        this.trainingPlanNumber = trainingPlanNumber;
        this.boxerStyle = boxerStyle;
        this.boxerPerson = boxerPerson;
        this.element = element;
        this.workOut = workOut;
    }
}
