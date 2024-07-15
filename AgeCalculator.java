import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {

    public static void main(String[] args) {
        // Input birthdate from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateStr = scanner.nextLine();

        // Parse birthdate string
        LocalDate birthdate = LocalDate.parse(birthdateStr);

        // Get current date
        LocalDate today = LocalDate.now();

        // Calculate age period
        Period period = Period.between(birthdate, today);

        // Print age in years, months, days format
        System.out.println("Your age is: " + period.getYears() + " years, "
                + period.getMonths() + " months, and " + period.getDays() + " days.");
    }
}