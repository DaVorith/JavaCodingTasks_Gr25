package week08.task2;

import java.util.Arrays;

public class Array_Move_Zeros_To_The_End_Fatih {

    public static int[] moveZeros(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining spots with zeros
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] result = moveZeros(arr);
        System.out.println("Array after moving zeros: " + Arrays.toString(result));
    }


}

/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
