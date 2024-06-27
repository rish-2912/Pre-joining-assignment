package collections.primitives;

import java.util.Map;
import java.util.TreeMap;

public class MapOperations {
    public static void mapOperations() {

        Map<String, String> mapA = new TreeMap<>();

        // Inserting elements using put() method
        mapA.put("India", "Delhi");
        mapA.put("England", "London");
        mapA.put("France", "Paris");
        mapA.put("China", "Beijing");
        mapA.put("Germany", "Berlin");

        System.out.println("Countries and their Capitals: " + mapA);

        // Removing element from map using its key
        mapA.remove("China");
        System.out.println("Map A after removing 'China': " + mapA);

        // To get size of the map.
        System.out.println("Map A size is: " + mapA.size());

        // To find an value of element in map based on its key
        System.out.println("Map A element value for key 'India': " + mapA.get("India"));

        // Keys present in map
        System.out.println("Map A has following Countries: " + mapA.keySet());

        // To check if key and value is present in a map
        System.out.println("Checking if key 'England' and value 'Berlin' is present: " + mapA.containsKey("England")
                + " and " + mapA.containsValue("Berlin"));

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        mapOperations();
    }

}
