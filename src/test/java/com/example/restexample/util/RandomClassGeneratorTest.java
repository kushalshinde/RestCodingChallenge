package com.example.restexample.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class RandomClassGeneratorTest {

    private enum EnumCheck{
        YES, No
    }

    @Test
    @DisplayName("Test a valid Number Generator")
    public void givenLowerAndHigherValues_whenNumberGeneratorMethodCalled_returnValidValue(){
        String result = RandomClassGenerator.numberGenerator(1, 600);
        assertTrue(result.matches("^[0-9]+${1,3}"));
    }

    @Test
    @DisplayName("Test if Lower limit is Higher than HigherLimit parameter in Number Generator")
    public void givenSwapLowerAndHigherValues_whenNumberGeneratorMethodCalled_ThrowsException(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RandomClassGenerator.numberGenerator(6,1);
        });

        assertEquals("bound must be positive", thrown.getMessage());
    }

    @Test
    @DisplayName("Test if any parameter is Zero in Number Generator")
    public void givenParameterValueZero_whenNumberGeneratorMethodCalled_ThrowsException(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RandomClassGenerator.numberGenerator(0,6);
        });
    }

    @Test
    @DisplayName("Test if Enum Generator has a valid output")
    public void givenEnumParameter_whenEnumGeneratorMethodCalled_returnValidValue(){
        String result = RandomClassGenerator.enumGenerator(EnumCheck.class);
        assertNotNull(result);
    }

    @Test
    @DisplayName("Test if Map Generator has a valid output")
    public void givenMapParameter_whenMapGeneratorMethodCalled_returnValidValue(){
        Map<String,String> map = new HashMap<>();
        map.put("one", "test1");
        map.put("two", "test2");

        String result = RandomClassGenerator.mapGenerator(map);
        assertNotNull(result);
    }

    @Test
    @DisplayName("Test of Empty Map throws Exception")
    public void givenEmptyMapParameter_whenMapGeneratorMethodCalled_ThrowsException(){
        Map<String,String> map = new HashMap<>();

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RandomClassGenerator.mapGenerator(map);
        });
    }
}