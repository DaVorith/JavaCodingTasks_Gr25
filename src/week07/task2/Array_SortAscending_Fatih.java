package week07.task2;

import java.util.Arrays;

public class Array_SortAscending_Fatih {

    /*
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, -1, 0};
        arr = sortAscending(arr);
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortAscending(int[] arr) {
        // Algorithm implementation of sorting
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //if they are in the wrong order, swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAscending(10, 9, 8, 7, 6, 5, 4, 3 )));
    }


    public static int[] sortAscending(int... arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
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

 /*   Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7, 6, 5, 4, 3};
        arr = sortAscending(arr); ==>{ 3, 4, 5, 6, 7, 8, 9, 10};


  */