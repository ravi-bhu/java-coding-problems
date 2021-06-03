package org.bhushan.org.bhushan.ch01_StringsNumbersMath;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * Write a program that returns the first non-repeated character from a given string
 */
public class Ch01_Q02_FirstNonRepeatedChar {
    public static Optional<Character> findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> characterCount = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (characterCount.containsKey(str.charAt(i))) {
                characterCount.put(str.charAt(i), characterCount.get(str.charAt(i)) + 1);
            } else {
                characterCount.put(str.charAt(i), 1);
            }
        }
        for (var entry : characterCount.entrySet()) {
            if (entry.getValue() == 1) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.empty();
    }
}
