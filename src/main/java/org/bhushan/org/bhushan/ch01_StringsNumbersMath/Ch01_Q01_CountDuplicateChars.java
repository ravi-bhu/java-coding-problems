package org.bhushan.org.bhushan.ch01_StringsNumbersMath;

/**
 * Write a program that counts duplicate characters from a given string
 */
public class Ch01_Q01_CountDuplicateChars {
    public static long countDuplicateCharacters(String str) {
        return str.length() - str.chars().distinct().count();
    }
}
