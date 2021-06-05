package org.bhushan.org.bhushan.ch01_StringsNumbersMath.imperative;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program that counts duplicate characters from a given string
 */
public class Q01_CountDuplicateChars {
    public static long countDuplicateCharacters_imperative(String str) {
        Map<Integer, Integer> characterCounter = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int charPoint = str.codePointAt(i);
            characterCounter.compute(charPoint, (k, v) -> (v == null) ? 1 : ++v);
        }
        long count = 0;
        for (var entry : characterCounter.entrySet()) {
            if (entry.getValue() > 1) {
                count = count + entry.getValue() - 1;
            }
        }
        return count;
    }
}
