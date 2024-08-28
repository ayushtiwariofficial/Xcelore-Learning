import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateAndTime {
    public static void main(String[] args) {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime yesterday = now.minusDays(1);
            System.out.println(now);
            System.out.println(yesterday);

            ZonedDateTime zoneTime = ZonedDateTime.now();
            Set<String> zoneId = ZoneId.getAvailableZoneIds();
            System.out.println(zoneTime);
            // System.out.println(zoneId.toString());

            ZonedDateTime IndiaTime = ZonedDateTime.now();
            ZonedDateTime NYCTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
            System.out.println("Current Time in India: "+ IndiaTime);
            System.out.println("Current Time in NYC: "+ NYCTime);

            LocalDate todayDate = LocalDate.now();
            LocalDate then = LocalDate.of(2001, 3, 1);
            Period between = Period.between(todayDate, then);
            System.out.println(between);

            String date = "01/03/2002";
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate thatDate = LocalDate.parse(date, format);
            System.out.println(thatDate);


    }
}
