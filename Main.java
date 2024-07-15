import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter the list to keep only non-empty strings
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                // Filter out empty strings
                .collect(Collectors.toList()); // Collect the non-empty strings into a new list

        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);
    }
}


