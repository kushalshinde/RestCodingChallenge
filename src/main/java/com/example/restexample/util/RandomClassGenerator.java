package com.example.restexample.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomClassGenerator {

    /**
     * Generate a random number within a specific lower and upper bound
     * @param lowerLimit
     * @param higherLimit
     * @return a random number generator in a String format
     */
    public static String numberGenerator(int lowerLimit, int higherLimit){
        if(lowerLimit == 0  || higherLimit == 0)
            throw new IllegalArgumentException();

        Random random = new Random();
        return String.valueOf(random.nextInt(higherLimit - lowerLimit) + lowerLimit);
    }

    /**
     * Generate a random value from an enum
     * @param enumName
     * @return a random enum value
     */
    public static String enumGenerator(Class<? extends Enum<?>> enumName){
        return String.valueOf(enumName.getEnumConstants()[(int) (Math.random() * enumName.getEnumConstants().length)]);
    }


    /**
     * Generate a random key from the map
     * @param map
     * @return a random key
     */
    public static String mapGenerator(Map<String, String> map){
        if(map.isEmpty())
            throw new IllegalArgumentException();

        List<String> keys = new ArrayList<String>(map.keySet());
        Random random = new Random();
        return keys.get(random.nextInt(keys.size()));
    }

}
