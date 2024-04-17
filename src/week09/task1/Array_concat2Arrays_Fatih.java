package week09.task1;

import java.util.Arrays;

public class Array_concat2Arrays_Fatih {

    public static void main(String[] args) {
        // Test arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        // Concatenate arrays and print the result
        int[] result = concatenateArrays(arr1, arr2);
        System.out.println("Concatenated array: " + Arrays.toString(result));
    }


    // Method to concatenate two arrays
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        // Calculate the length of the concatenated array
        int[] result = new int[arr1.length + arr2.length];
        // Create a new array to hold the concatenated result

        int index = 0; // Initialize an index to keep track of the current position in the result array

        // Iterate over the elements of the first array (arr1)
        for (int num : arr1) {
            result[index++] = num; // Copy each element of arr1 into the result array, and increment the index
        }

        // Iterate over the elements of the second array (arr2)
        for (int num : arr2) {
            result[index++] = num; // Copy each element of arr2 into the result array, and increment the index
        }

        return result; // Return the concatenated array
    }
}
