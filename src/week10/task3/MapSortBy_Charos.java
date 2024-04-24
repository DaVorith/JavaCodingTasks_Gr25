package week10.task3;

import java.util.*;

public class MapSortBy_Charos {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Alice", 25);
        map.put("Bob", 35);
        map.put("Diana", 28);

        // Sorting the map by values
        Map<String, Integer> sortedMap = sortByValues(map);

        // Printing the sorted map
        System.out.println("Sorted Map by values: " + sortedMap);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValues(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
/*
 Map - Sort the map by values
Write a method that can sort the Map by values.

This sortByValues method takes a Map<K, V> as input and returns a new Map<K, V> sorted by
values. It sorts the entries of the map based on their values using the Collections.sort method and a
 custom Comparator. Finally, it constructs and returns a new LinkedHashMap to maintain the sorted order.
 */
