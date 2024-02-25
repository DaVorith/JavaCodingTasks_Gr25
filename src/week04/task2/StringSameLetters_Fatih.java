package week04.task2;

import java.util.Arrays;

public class StringSameLetters_Fatih {

    public static void main(String[] args) {
        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false
    }

    public static boolean same(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted character arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

}

/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */
