package mz1.datatime;

import static mz1.datatime.Exc10.localDataNow;
import static mz1.datatime.Exc11.localTimeDataNow;
import static mz1.datatime.Exc12.period;
import static mz1.datatime.Exc13.duration;
import static mz1.datatime.Exc14.tokyoTime;
import static mz1.datatime.Exc15.bydgoszcz;
import static mz1.datatime.Exc9.localTimeNow;

public class Mz1DataTimeMain {
    public static void main(String[] args) {
        localTimeNow();
        localDataNow();
        localTimeDataNow();
        period();
        duration();
        tokyoTime();
        bydgoszcz();
    }
}
