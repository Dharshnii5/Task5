import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 public class ListandLambdaexpression {
        public static void main(String[] args) {
            List<String> students = Arrays.asList("Aariya", "Briha", "Chandika", "Dhakshana", "Ezhil", "Sasvika", "Asritha", "Guha", "Mayilini", "Anika");

            // Filter students whose names start with "A" using a lambda expression
            List<String> specialGiftStudents = students.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println("Students getting special gifts: " + specialGiftStudents);
        }
    }

