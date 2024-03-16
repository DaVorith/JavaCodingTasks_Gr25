package week04;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(same(str1, str2));

        str1 = "abc";
        str2 = "abb";
        System.out.println(same(str1, str2));
    }

    public static boolean same(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }
}
/*
String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
       // Check if the sorted arrays are equal
        // Convert strings to character arrays and sort them


We first convert the strings to character arrays using toCharArray() method.
Then, we sort both arrays using Arrays.sort() method.
Finally, we use Arrays.equals() method to check if the sorted arrays are equal,
which indicates whether the strings are built out of the same letters.
 */
