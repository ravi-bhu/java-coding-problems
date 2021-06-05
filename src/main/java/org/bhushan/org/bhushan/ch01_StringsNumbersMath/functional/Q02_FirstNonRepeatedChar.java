package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a program that returns the first non-repeated character from a given string
 */
public class Q02_FirstNonRepeatedChar {
    public static String findFirstNonRepeatedChar_functional(String str) {
        Map<Integer, Long> characterCount
                = str.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int cp = characterCount.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);
        return String.valueOf(Character.toChars(cp));
    }
}
