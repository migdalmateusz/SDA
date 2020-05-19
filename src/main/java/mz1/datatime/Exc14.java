package mz1.datatime;

import java.time.LocalTime;
import java.time.ZoneId;

public class Exc14 {

    public static void tokyoTime () {
        LocalTime tokyo = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(tokyo);
    }
}
