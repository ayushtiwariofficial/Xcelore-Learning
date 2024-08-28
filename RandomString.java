import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomString {
    private static String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static Random RANDOM = new Random();
    private static int STRING_LENGTH = 5; // We're defining the length of each random string
    private static int LIST_SIZE = 5; // Number of random strings in the list

    public static void main(String[] args) {
        Supplier<List<String>> randomStringsSupplier = () -> {
            List<String> strings = new ArrayList<>();
            for (int i = 0; i < LIST_SIZE; i++) {
                strings.add(generateRandomString(STRING_LENGTH));
            }
            return strings;
        };

        // Generate and print the list of random strings
        List<String> randomStrings = randomStringsSupplier.get();
        System.out.println(randomStrings);
    }

    private static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }
}
