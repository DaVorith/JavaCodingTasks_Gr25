package week03.task2;

public class ReverseNegNum {
    public static void main(String[] args) {
        int input = -35;
        int reversed = reverseNegativeNumber(input);
        System.out.println("Original number: " + input);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNegativeNumber(int num) {

        String numStr = String.valueOf(num).substring(1);

        String reversedStr = new StringBuilder(numStr).reverse().toString();

        int reversedNum = Integer.parseInt(reversedStr);

        if (num < 0) {
            reversedNum *= -1;
        }
        return reversedNum;
    }
}
/*
 Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
/*
Explanation:
We convert the negative number to a string and remove the negative sign if it exists.
Then, we reverse the string using StringBuilder.
After that, we parse the reversed string back to an integer.
Finally, we add the negative sign back if the original number was negative.
 */

