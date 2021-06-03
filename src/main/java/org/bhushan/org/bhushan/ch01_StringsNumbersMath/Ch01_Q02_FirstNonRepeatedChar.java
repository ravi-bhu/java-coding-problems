package org.bhushan.org.bhushan.ch01_StringsNumbersMath;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Write a program that returns the first non-repeated character from a given string
 */
public class Ch01_Q02_FirstNonRepeatedChar {
    public static Optional<Character> findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> characterCount = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            characterCount.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }
        for (var entry : characterCount.entrySet()) {
            if (entry.getValue() == 1) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.empty();
    }
}
