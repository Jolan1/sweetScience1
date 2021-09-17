package com.bnta4.sweetscience;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SweetScienceApplicationTests {

    @Autowired
    private ApplicationContext context;

@Test
void testMain(){
    SweetScienceApplication.main(new String[]{"--server.port=0"});
}

    @Test
    void contextLoads() {
        assertNotNull(context);
    }

}
