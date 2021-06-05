package org.bhushan.org.bhushan.ch01_StringsNumbersMath.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Write a program that reverses the letters of each word
 */
public class Q03_ReverseWords {
    public static String reverseWords_imperative(String str) {
        var tokens = new StringTokenizer(str, " ");
        List<String> strings = new ArrayList<>();
        while (tokens.hasMoreTokens()) {
            strings.add(reverseString(tokens.nextToken()));
        }
        return String.join(" ", strings);
    }

    private static String reverseString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
        }
        return String.valueOf(chars);
    }
}
