import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2001, 3, 1);
        LocalDate date2 = LocalDate.of(2025, 3, 1); 

        // Calculate the difference in days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(date2, date1);

        // Print the difference
        System.out.println("Difference in days: " + daysBetween);
    }
}
