package week04.task3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates_Mermina {

    public static String removeDuplicates(String input) {
        if (input == null) {
            return null; // Handle null input
        }

        char[] chars = input.toCharArray();
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char c : chars) {
            uniqueChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character character : uniqueChars) {
            result.append(character);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "SKAFISKAFMJAK";
        String input2 = "entuziazam";

        System.out.println(removeDuplicates(input1)); // Output: ABC
        System.out.println(removeDuplicates(input2)); // Output: abcd
    }
}






   // Write a return method that can remove the duplicated values from the String
   // Ex: removeDup("AAABBBCCC") ==> ABC

//Explanation:ava code defines a method called removeDuplicates that removes duplicated characters from a string. It uses a LinkedHashSet to preserve the order of characters while eliminating duplicates. The method takes an input string and returns a new string with unique characters. For example, removeDuplicates("AAABBBCCC") returns "ABC".
//duplicated characters from a string. It uses a LinkedHashSet to preserve
//the order of characters while eliminating duplicates. The method takes an input
//input string and returns a new string with unique characters. For example
// removeDuplicates("1122334455") returns "12345".