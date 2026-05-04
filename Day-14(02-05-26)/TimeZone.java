
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class WorldClock {

    public static void main(String[] args) {
      
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZoneId singapore = ZoneId.of("Asia/Singapore");
        ZoneId dhaka = ZoneId.of("Asia/Dhaka");
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId newYork = ZoneId.of("America/New_York");

        ZonedDateTime timeSingapore = ZonedDateTime.now(singapore);
        ZonedDateTime timeDhaka = ZonedDateTime.now(dhaka);
        ZonedDateTime timeLondon = ZonedDateTime.now(london);
        ZonedDateTime timeNewYork = ZonedDateTime.now(newYork);

        System.out.println("===== World Clock =====");
        System.out.println("Singapore: " + format.format(timeSingapore));
        System.out.println("Dhaka     : " + format.format(timeDhaka));
        System.out.println("London    : " + format.format(timeLondon));
        System.out.println("New York  : " + format.format(timeNewYork));
    }
}
