package week04.task2;

import java.util.Arrays;

public class SameLetters_Anas {
    public static void main(String[] args) {
        System.out.println(SameLetters("aaabbbc","abbbcaa"));
    }

    public static boolean SameLetters(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return (Arrays.equals(arr1, arr2));

    }
}
