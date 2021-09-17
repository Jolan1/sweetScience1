package com.bnta4.sweetscience.training;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingPlanService {

    private final TrainingPlanRepository trainingPlanRepository;

    @Autowired
    public TrainingPlanService(
            TrainingPlanRepository trainingPlanRepository) {
        this.trainingPlanRepository = trainingPlanRepository;
    }

    List<TrainingPlan> getTrainingPlan() {
        return (List<TrainingPlan>) trainingPlanRepository.findAll();
    }

    TrainingPlan getTrainingPlan(Long id) throws NotFoundException {
        return trainingPlanRepository
                .findById(id)
                .orElseThrow(
                        () -> new NotFoundException(
                                "Training plain with id " + id + " not found. Please try again."));
    }
}
