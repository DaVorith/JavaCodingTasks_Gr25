package week04.task2;

import java.util.HashMap;
import java.util.Map;

public class Same_Letters_Mermina {

        public static boolean madeOutOfSameLetters(String a, String b) {
            if (a == null || b == null) {
                return false; // Handle null strings
            }

            Map<Character, Integer> charCount = new HashMap<>();

            for (char c : a.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            for (char c : b.toCharArray()) {
                if (!charCount.containsKey(c)) {
                    return false; // Character not present in first string
                }
                charCount.put(c, charCount.get(c) - 1);
                if (charCount.get(c) == 0) {
                    charCount.remove(c);
                }
            }

            return charCount.isEmpty();
        }

        public static void main(String[] args) {
            System.out.println(madeOutOfSameLetters("abc", "cab")); // true
            System.out.println(madeOutOfSameLetters("abc", "abb")); // false
        }
    }






//Write a return method that checks if a string is built out of the same letters as another string
//  Ex: same("abc", "cab"); ==> true
//      same("abc", "abb"); ==> false


// Explanation:he madeOutOfSameLetters method checks if two strings are made out currences
//of the same letters. It counts the occurrences of each character
//in both strings and compares those counts. If the counts match,
// the strings are considered to be made out of the same letters.
//("abc", "cab") returns true, while madeOutOfSameLetters("abc", "abb") returns false.
