package week10.task1;

import java.util.ArrayList;

public class ArraySort_Charos {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // Sorting the ArrayList in ascending order
        bubbleSort(numbers);

        // Printing the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list[j] and list[j+1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
/*

  ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
 */
