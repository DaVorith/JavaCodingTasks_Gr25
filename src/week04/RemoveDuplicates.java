package week04;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result);
    }

    public static String removeDup(String str) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();


        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }


        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
/*
  String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC


  // Use LinkedHashSet to maintain order and remove duplicates
  // Add characters to set (duplicates will be automatically removed)
  // Convert the set to a string
  i use a LinkedHashSet, which maintains the order of insertion and does not allow duplicates, to store unique characters.
i iterate through the input string and add each character to the LinkedHashSet.
Since LinkedHashSet doesn't allow duplicates, only unique characters will be added.
Finally, we build a string from the characters in the LinkedHashSet and return it as the result.
 */
