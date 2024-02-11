package week03;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }


        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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