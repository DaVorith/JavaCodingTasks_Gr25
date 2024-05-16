package week10.task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSortingInAscending_Fatih {

    public static void main(String[] args) {
        // Sample ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);

        // Sort the ArrayList in ascending order
        ascendingSort(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
    }

    // Method to sort ArrayList in ascending order
    public static void ascendingSort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    // Swap elements if they are in the wrong order
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
