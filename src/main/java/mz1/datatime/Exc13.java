package mz1.datatime;

import java.time.Duration;
import java.time.LocalTime;

public class Exc13 {

    public static void duration () {
        LocalTime one = LocalTime.of(14,11);
        LocalTime two = LocalTime.of(18,41);
        Duration oneTwo = Duration.between(two, one);
        System.out.println(oneTwo);
    }
}
