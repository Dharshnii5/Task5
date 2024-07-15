import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
    class UppercaseList{
        public static void main(String[] args) {
            Stream<String> nameStream = Stream.of("aBc", "d", "ef");

            // Convert the Stream to a List for easier processing

            List<String> names = nameStream.collect(Collectors.toList());

            // Use the map method to convert each string to uppercase

            List<String> uppercaseNames = names.stream()
                    .map(String::toUpperCase) // Use a method reference for brevity
                    .collect(Collectors.toList());

            // Print the uppercase names

            System.out.println(uppercaseNames);
        }
}
