import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MergeMaps {
    public static void main(String[] args) {
        // Define the BiConsumer
        BiConsumer<Map<String, Integer>, Map<String, Integer>> mergeMaps = (map1, map2) -> 
            map2.forEach((key, value) -> map1.merge(key, value, (oldValue, newValue) -> oldValue + newValue));

        // Create and initialize two maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("b", 5);
        map2.put("c", 10);
        map2.put("d", 4);

        // Use the BiConsumer to merge map2 into map1
        mergeMaps.accept(map1, map2);

        // Print the result
        System.out.println(map1); // Output: {a=1, b=7, c=13, d=4}
    }
}
