package com.example.restexample.util;

import java.util.Random;

public class RandomClassGenerator {

    public static String numberGenerator(int lowerLimit, int higherLimit){
        Random random = new Random();
        return String.valueOf(random.nextInt(higherLimit - lowerLimit) + lowerLimit);
    }

    public static String enumGenerator(Class<? extends Enum<?>> enumName){
        return String.valueOf(enumName.getEnumConstants()[(int) (Math.random() * enumName.getEnumConstants().length)]);
    }

    public static String stringGenerator(int limit, String source){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
