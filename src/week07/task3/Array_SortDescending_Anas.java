package week07.task3;

import java.util.Arrays;

public class Array_SortDescending_Anas {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortDescending(new int []{5,2,3,4,1})));
    }
    public static int [] SortDescending(int[] arr){


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int elementAtIndexJ = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = elementAtIndexJ;
                }
            }
        }


        return arr;
    }
}
