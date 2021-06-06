package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

public class Q06_CountOccurrence {
    public static long countOccurrence_functional(String str, char search) {
        return str.chars()
                .filter(c -> (char)c == search)
                .count();
    }
}
