package com.bnta4.sweetscience;

import com.bnta4.sweetscience.training.TrainingPlanRepository;
import com.bnta4.sweetscience.users.UsersRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SweetScienceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SweetScienceControllerIT {

    private static final String BASE_URL = "/api/sweetScience";

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private TrainingPlanRepository trainingPlanRepository;

    MockMvc mockMvc;

    @Before
    public void setUp(){
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void givenValidQuestionReturnsOk() throws Exception{
        this.mockMvc.perform(get(BASE_URL + "/question/1")).andExpect(status().isOk());
    }

    @Test
    public void givenInvalidQuestionReturnsNotFound() throws Exception{
        this.mockMvc.perform(get(BASE_URL + "/question/0")).andExpect(status().isNotFound());
    }
}


