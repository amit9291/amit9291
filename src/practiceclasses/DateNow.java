package practiceclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class DateNow {
    public static void main(String[] args) {
        LocalDate TodayDate =  LocalDate.now();
        LocalTime TodayTime = LocalTime.now();
        LocalDateTime TodayDateandTime = LocalDateTime.now();

        System.out.println(TodayDate);
        System.out.println(TodayTime);
        System.out.println(TodayDateandTime);
    }
}

