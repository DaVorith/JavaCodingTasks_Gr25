package week03;

public class PrimeNumber {
//
public static boolean isPrime(int number) {
    // 1 and numbers less than 1 are not prime
    if (number <= 1) {
        return false;
    }

    // Check for divisibility by numbers up to the square root of the number
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            // If the number is divisible by any number other than 1 and itself, it's not prime
            return false;
        }
    }

    // If no divisors were found, the number is prime
    return true;
}

    public static void main(String[] args) {
        // Test cases
        int num1 = 17;
        System.out.println(num1 + " is prime: " + isPrime(num1)); // true

        int num2 = 20;
        System.out.println(num2 + " is prime: " + isPrime(num2)); // false

        int num3 = 2;
        System.out.println(num3 + " is prime: " + isPrime(num3)); // true

        int num4 = 1;
        System.out.println(num4 + " is prime: " + isPrime(num4)); // false
    }

}
/*

 Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
 */
/*
Explanation:

The method isPrime() takes an integer number as input and returns true if the number is prime,
and false otherwise.
If the number is less than or equal to 1, it's not prime, so the method returns false.
If the number is less than or equal to 3, it's prime, so the method returns true.
The loop iterates from 2 to the square root of the number.
If the number is divisible by any integer in this range, it's not prime, so the method returns false.
If the loop completes without finding any divisors, the number is prime, so the method returns true.
 */