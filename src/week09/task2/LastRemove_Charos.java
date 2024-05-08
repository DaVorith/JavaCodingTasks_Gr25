package week09.task2;

import java.util.ArrayList;
import java.util.List;

public class LastRemove_Charos {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Zack");

        // Remove all occurrences of "Ahmed"
        removeName(names, "Ahmed");

        // Print the modified list
        System.out.println("List after removing Ahmed:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void removeName(List<String> names, String nameToRemove) {
        names.removeIf(name -> name.equals(nameToRemove));
    }
}
/*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Zack".....
Write a java operation to remove all the names named Ahmed

We create a list of names.
We define a method removeName that takes a list of names and the name to be removed as parameters.
Within this method, we use the removeIf method of the List interface to remove all occurrences
of the specified name from the list.
We call the removeName method with the list of names and the name "Ahmed" to remove all occurrences
of "Ahmed" from the list.
Finally, we print the modified list after removing "Ahmed".
 */
