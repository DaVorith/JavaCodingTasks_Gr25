package week11.task1;

import java.util.HashMap;
import java.util.Map;

public class Map_FrequencyofCharactersCharos {

    public static void main(String[] args) {
        String str = "Hello I Like Cydeo!";
        printCharacterFrequency(str);
    }

    public static void printCharacterFrequency(String str) {
        // Creating a HashMap to store characters and their frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Converting the string to char array
        char[] charArray = str.toCharArray();

        // Iterating through the char array
        for (char c : charArray) {
            // Updating the frequency map
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        // Printing the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
/*
Write a method that prints the frequency of each character from a String.
 */
