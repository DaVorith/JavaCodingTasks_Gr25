package week05.task1;

public class FindTheUnique_Fatih {

    public static void main(String[] args) {

        String input = "AAABXBBCCCDEF";
        String result = uniqueChar(input);
        System.out.println(result);

    }


    // Using Nested Loop
    public static String uniqueChar(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < input.length(); j++) {
                if (i != j && currentChar == input.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result += currentChar;
            }
        }
        return result;
    }



}
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */