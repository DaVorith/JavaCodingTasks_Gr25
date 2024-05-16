package week08.task1.ArrayNUnique;

import java.util.Arrays;

public class Array_N_Unique_Fatih {

    public static int[] generateUniqueSumZeroArray(int n) {
        if (n < 2 || n > 99) {
            throw new IllegalArgumentException("N must be between 2 and 99");
        }

        int[] result = new int[n];

        // Fill the array with alternating positive and negative values (1, -1, 2, -2, ...)
        for (int i = 0; i < n - 1; i++) {
            result[i] = (i % 2 == 0) ? 1 : -1;
        }

        // Adjust the last element to make the sum zero
        result[n - 1] = -n + (n - 1); // Calculate the remaining value to sum to 0

        return result;
    }

    public static void main(String[] args) {
        int n = 4; // Example usage
        int[] array = generateUniqueSumZeroArray(n);
        System.out.println("Array with N unique integers summing to 0: " + Arrays.toString(array));
    }


}
/*
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
 */