package week10.task2;

import java.util.ArrayList;

public class ArrayListDescen_Charos {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // Sorting the ArrayList in descending order
        bubbleSortDescending(numbers);

        // Printing the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order: " + numbers);
    }

    public static void bubbleSortDescending(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
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
  ArrayList - sorting in descending order
Write a method that can sort the ArrayList in Descending order without using the sort method.

This bubbleSortDescending method sorts the ArrayList list in descending order by comparing adjacent
 elements and swapping them if they are in the wrong order. This process is repeated until the entire
  list is sorted in descending order.
 */
