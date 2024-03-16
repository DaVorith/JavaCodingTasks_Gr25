package week04;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "AAABBCDD";
        Map<Character, Integer> frequencyMap = frequencyOfChars(input);
        System.out.println(frequencyMap);
    }

    public static Map<Character, Integer> frequencyOfChars(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();


        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }
}
/*
String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
/*

This code defines a method frequencyOfChars that takes a string as input and returns a map
 where keys are
characters and values are their frequencies in the string.

The main method demonstrates its usage by providing the string "AAABBCDD" and printing out
the resulting frequency map.
 */
