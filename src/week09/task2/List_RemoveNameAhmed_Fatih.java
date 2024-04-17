package week09.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed_Fatih {

    //Solution1
    public static void main(String[] args) {
        // List of people's names
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Zack"));

        // Remove all occurrences of "Ahmed"
        names.removeAll(Arrays.asList("Ahmed"));

        // Print the updated list
        System.out.println("Names after removing Ahmed: " + names);
    }




}
