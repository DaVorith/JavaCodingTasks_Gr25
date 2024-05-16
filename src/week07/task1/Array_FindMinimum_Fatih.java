package week07.task1;

public class Array_FindMinimum_Fatih {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 7, 8, 90};
        int min = numbers[0];  // assume that the first element is the minimum number

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) { // compares the element of the array with the current minimum number
                min = numbers[i]; // replace the current minimum number
            }
        }
        System.out.println("Min number is = " + min);
    }

}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
