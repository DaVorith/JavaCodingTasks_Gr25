package week03.task1;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("isPrime(7) = " + isPrime(5));
        System.out.println("isPrime(6) = " + isPrime(6));
    }

    public static boolean isPrime(int number) {


        if (number <= 1) {// 0 and 1 are not prime numbers
            return false;
        }
        for (int i = 2; i < number; i++) {// Check for divisibility from 2 to the half of the number
            if (number % i == 0) {
                return false; // If the number is divisible by any other number, it's not prime
            }
        }

        return true;//If no divisor is found, the number is prime
    }
}


/*
PrimeNumber
Write a method that can check if a number is prime or not
A number is prime if it is only divisible by one and itself
 */