package com.example.jenkins_demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@Slf4j
class JenkinsDemoApplicationTests {

    @Test
    void contextLoads() {
        log.info("test executing...");
assertEquals(true,true);
    }
}
