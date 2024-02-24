package week04.task3;

public class StringRemoveDuplicates_Fatih {

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC")); // ABC
    }

    public static String removeDup(String word) {
        String result = "";

        // Iterate through each character in the input string
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // Check if the character is not already in the result string
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        return result;
    }

}

/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */
