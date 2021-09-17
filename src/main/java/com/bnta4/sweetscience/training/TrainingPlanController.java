package com.bnta4.sweetscience.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/trainingPlan")
public class TrainingPlanController {


    private final TrainingPlanService trainingPlanService;

    @Autowired
    public TrainingPlanController(TrainingPlanService trainingPlanService) {this.trainingPlanService =
            trainingPlanService;
    }

    @GetMapping(value = "all")
    List<TrainingPlan> getUser() {
        return trainingPlanService.getTrainingPlan();
    }

    @PostMapping
    void createNewTrainingPlan(@RequestBody TrainingPlan trainingPlanService) {
        System.out.println(TrainingPlanController.this.trainingPlanService);
    }

    @PutMapping
    void updateTrainingPlan(@RequestBody TrainingPlan trainingPlanService) {
        System.out.println(TrainingPlanController.this.trainingPlanService);
    }

    @DeleteMapping(path = "{trainingPlanId}")
    void deleteTrainingPlan(@PathVariable("trainingPlanId") Long id) {
    }
}
