package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {"levelNumber=1"})
public class LevelControllerTestEquals1 {
    @Autowired
    private LevelController levelController;

    @Test
    public void shouldReturnBasicWhenLevelNumberIsLessThan1() {
        assertEquals(levelController.getLevel(), "advanced");
    }
}
