package week03.task02;


class ReverseNegativeNumber_Mermina {

    public static void main(String[] args) {

        int input = -35; // Replace with your desired negative number
        System.out.println("Original number: " + input);
        int reversed = reverseNumber(input);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNumber(int number) {
        if (number < 0) {
            return -reversePositive(-number);
        } else {
            return reversePositive(number);
        }
    }

    private static int reversePositive(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

}
// Write return method that can reverse digits of a negative number and return
 //it as int input: -35 output: -53 //



//explanation:The reverseNumber method checks if the input is negative. If so, it calls the reversePositive method with the positive value of the number.
//The reversePositive method reverses the digits of a positive number using a while loop.
//The final result is adjusted to be negative if the original input was negative.
//For the given input of -35, the output will be -53.
