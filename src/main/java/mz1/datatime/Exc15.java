package mz1.datatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exc15 {
    public static void bydgoszcz () {
        LocalDateTime bydgoszczTime = LocalDateTime.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE hh:mm:ss");
        System.out.println(dtf1.format(bydgoszczTime)+" roku, " + dtf2.format(bydgoszczTime));
    }
}
