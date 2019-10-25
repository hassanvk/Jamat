package com.hassan.JamatStatus;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time {

    static String getZonedTime(){
        ZoneId zone = ZoneId.of("US/Central");
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        return zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }

    static String getZonedTime(DateTimeFormatter dateTimeFormatter){
        ZoneId zone = ZoneId.of("US/Central");
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        return zonedDateTime.format(dateTimeFormatter);
    }
}
