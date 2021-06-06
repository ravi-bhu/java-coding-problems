package org.bhushan.org.bhushan.ch01_StringsNumbersMath.imperative;

public class Q06_CountOccurrence {
    public static long countOccurrence_imperative(String str, char search) {
        long count = 0;
        for (char c : str.toCharArray()) {
            if (c == search) {
                count++;
            }
        }
        return count;
    }
}
