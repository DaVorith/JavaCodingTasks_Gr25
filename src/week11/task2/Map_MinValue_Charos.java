package week11.task2;

import java.util.Map;

public class Map_MinValue_Charos {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 5, "C", 15, "D", 3);
        int minValue = findMinValue(map);
        System.out.println("Minimum value in the map: " + minValue);
    }

    public static int findMinValue(Map<String, Integer> map) {
        // Initializing min value with maximum possible integer value
        int minValue = Integer.MAX_VALUE;

        // Iterating through the map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // Updating min value if the current value is less than the previous min value
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
            }
        }

        // Returning the minimum value found
        return minValue;
    }
}
/*
, the findMinValue method takes a Map<String, Integer> as input and returns the minimum value
found in the map. It iterates through the entries of the map and updates the minValue variable
if it finds a value smaller than the current minimum. Finally, it returns the minimum value found.
Write a method that can return the minimum value from a map (DO NOT use sort method).
 */
