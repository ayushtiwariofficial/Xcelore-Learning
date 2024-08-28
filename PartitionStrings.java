import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionStrings {
    public static void main(String[] args) {
        // List of strings to be partitioned
        List<String> strings = List.of("apple", "banana", "kiwi", "mango");

        // Partition the list into even and odd length strings
        Map<Boolean, List<String>> partitioned = strings.stream()
            .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));

        // Get even length strings
        List<String> evenLengthStrings = partitioned.get(true);
        // Get odd length strings
        List<String> oddLengthStrings = partitioned.get(false);

        // Print the results
        System.out.println("Even length strings: " + evenLengthStrings);
        System.out.println("Odd length strings: " + oddLengthStrings);
    }
}
