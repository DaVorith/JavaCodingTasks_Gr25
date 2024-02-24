package week03.task2;

public class ReverseNegativeNumber_Fatih {
    public static void main(String[] args) {
        System.out.println( reverse(-47));
    }

    public static int reverse(int num) {// Method to reverse digits of a negative number


            if (num < 0) {// We check if the number is negative

                int reverse = 0;// here reverse the digits of the negative number

                while (num != 0) {
                    int lastDigit = num % 10;
                    reverse = reverse * 10 + lastDigit;
                    num /= 10;
                }
                return reverse;
            } else {

                return num; // Return the original input if it's not a negative number
            }
    }
}
/*
Reverse Negative Number;
Write a return method that can reverse digits of a negative number and return it as int
input: -35
output: -53
 */