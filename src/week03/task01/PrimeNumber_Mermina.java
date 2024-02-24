package week03.task01;

class PrimeNumber_Mermina{
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (isPrime(9))
            System.out.println("9 is a prime number.");
        else
            System.out.println("9 is not a prime number.");

        if (isPrime(17))
            System.out.println("17 is a prime number.");
        else
            System.out.println("17 is not a prime number.");
    }
}


                     // Write a method that can check if a number is prime or not//

// Prime number can only be multiplied by 1, and by itself//