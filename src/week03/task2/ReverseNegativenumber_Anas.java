package week03.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseNegativenumber_Anas {
    public static void main(String[] args) {
        System.out.println(NegativNum(-125));
        System.out.println(frequency("aaabbbccddddt"));
        System.out.println(SameLetters("aaabbbc","abbbcaa"));
        System.out.println(removeDup("aaabbbccddddt"));
    }
    public static int NegativNum(int num){

        String number ="";

        for (int i = String.valueOf(num).length()-1; i >0 ; i--) {
            number+= String.valueOf(num).charAt(i);
        }
        return -Integer.parseInt(number);
    }

    public static String frequency(String word){

        String result ="";

        for (int i = 0; i < word.length(); i++) {
            int c=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    c++;
                }
            }
            if (!result.contains(""+word.charAt(i))){
                result+= ""+word.charAt(i)+c;

            }
        }
        return result;

    }

    public static boolean SameLetters(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  (Arrays.equals(arr1, arr2));


    }

    public static String removeDup(String word) {
    String result="";
        for (int i = 0; i <word.length() ; i++) {
            if (!result.contains(""+word.charAt(i))){
                result+= ""+word.charAt(i);
            }
        }
        return result;
    }

}
