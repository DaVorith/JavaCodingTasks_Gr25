package week09.task1;

public class SumOfArray_Charos {
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        // Create a new array with combined length
        int[] result = new int[len1 + len2];

        // Copy elements from arr1
        for (int i = 0; i < len1; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < len2; i++) {
            result[len1 + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays(arr1, arr2);

        // Print concatenated array
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }


}
/*
Write a return method that can concatenate two arrays

This method takes two integer arrays (arr1 and arr2) as input and returns a new array
that contains all the elements of both arrays concatenated together.
 The concatenateArrays method first calculates the lengths of the input arrays,
 then creates a new array with a length equal to the sum of the lengths of the input arrays.
  It then copies elements from arr1 into the new array, followed by elements from arr2.
  Finally, it returns the concatenated array.




 */
