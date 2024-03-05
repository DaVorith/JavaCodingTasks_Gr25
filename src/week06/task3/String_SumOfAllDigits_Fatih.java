package week06.task3;

public class String_SumOfAllDigits_Fatih {

    public static void main(String[] args) {
        String input = "9 cydeo 5 usa 3";
        int result = calculateDigitSum(input);
        System.out.println(result);
    }

    public static int calculateDigitSum(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Subtract the ASCII value of '0' to get the numeric value and add to the sum
                sum += ch - '0';
            }
        }

        return sum;
    }

}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */