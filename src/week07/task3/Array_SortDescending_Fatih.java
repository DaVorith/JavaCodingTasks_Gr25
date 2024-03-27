package week07.task3;

import java.util.Arrays;

public class Array_SortDescending_Fatih {
/*
    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr);

        for (int num : arr) { // Print sorted array
            System.out.print(num + " ");
        }
    }

    public static int[] sortDescending(int[] arr) {
        int n = arr.length;
        // in descending order implementing Selection Sort algorithm
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[maxIndex];   // Swap elements
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(10, 20, 7, 8, 90)));
    }


    public static int[] sortDescending(int... arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] < arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }


        }
        return arr;


    }


}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
 */