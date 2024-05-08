package week09.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveValuesGreaterThat100_Charos {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(101);
        numbers.add(200);
        numbers.add(300);

        // Remove values greater than 100
        removeValuesGreaterThan100(numbers);

        // Print the modified list
        System.out.println("List after removing values greater than 100:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }

    public static void removeValuesGreaterThan100(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num > 100) {
                iterator.remove();
            }
        }
    }
}
/*

Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
We create a list of integers.
We define a method removeValuesGreaterThan100 that takes a list of integers as a parameter.
 Within this method, we use an iterator to iterate through the list. If a value is greater than 100,
 it's removed from the list using the remove method of the iterator.
We call the removeValuesGreaterThan100 method with the list of integers to remove all values greater
than 100.
Finally, we print the modified list after removing values greater than 100.



 */

