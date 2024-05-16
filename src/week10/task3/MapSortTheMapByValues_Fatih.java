package week10.task3;

import java.util.*;

public class MapSortTheMapByValues_Fatih {

    public static void main(String[] args) {
        // Sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Muhtar", 25);
        map.put("Kuzzat", 30);
        map.put("Aysun", 20);
        map.put("Zack", 35);

        // Sort the map by values
        Map<String, Integer> sortedMap = sortMapByValues(map);

        // Print the sorted map
        System.out.println("Sorted Map by Values: " + sortedMap);
    }

    // Method to sort a map by values
    public static Map<String, Integer> sortMapByValues(Map<String, Integer> map) {
        // Create a list of map entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the entryList based on values using Comparator.comparing
        entryList.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to preserve the order of insertion
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
