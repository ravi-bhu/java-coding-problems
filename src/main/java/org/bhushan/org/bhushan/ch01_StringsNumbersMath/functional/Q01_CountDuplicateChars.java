package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program that counts duplicate characters from a given string
 */
public class Q01_CountDuplicateChars {
    public static long countDuplicateCharacters_functional(String str) {
        return str.length() - str.codePoints().distinct().count();
    }
}
