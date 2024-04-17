package week09.task3;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveSomeValues_Fatih {

    //Solution1
    public static void main(String[] args) {
        // List of integers
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

        // Remove all values greater than 100
        numbers.removeIf(n -> n > 100);

        // Print the updated list
        System.out.println("Numbers after removing values greater than 100: " + numbers);
    }
}
