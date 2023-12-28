package edu.wgu.d387_sample_code.international;


import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//
// B3
// Converting time zones method
// CORS support
// Hypothetical time string
// ZoneId objects for certain time zones
// Convert the hypothetical time to ZoneId specified time zones
// Formats converted times into HH:mm
// Returns converted and formatted times as strings

@CrossOrigin(origins = "http://localhost:4200")
public class TimeConverter {

    private static final DateTimeFormatter formatting = DateTimeFormatter.ofPattern("HH:mm");

    public static String timeConversion() {
        String imaginaryTime = "2030-08-25T14:30:00Z";

        ZonedDateTime currentDateTimeZone = ZonedDateTime.parse(imaginaryTime);

        ZoneId easternZone = ZoneId.of("America/New_York");
        ZoneId mountainZone = ZoneId.of("America/Denver");
        ZoneId universalZone = ZoneId.of("UTC");

        ZonedDateTime easternTime = currentDateTimeZone.withZoneSameInstant(easternZone);
        ZonedDateTime mountainTime = currentDateTimeZone.withZoneSameInstant(mountainZone);
        ZonedDateTime universalTime = currentDateTimeZone.withZoneSameInstant(universalZone);

        String easternTimeString = easternTime.format(formatting);
        String mountainTimeString = mountainTime.format(formatting);
        String universalTimeString = universalTime.format(formatting);

        return easternTimeString + " ET, " +  mountainTimeString + " MT, "  + universalTimeString + " UTC";
    }
}
