package mz1.datatime;

import java.time.LocalDate;
import java.time.Period;

public class Exc12 {
    public static void period () {
        LocalDate one = LocalDate.of(2017,1,1);
        LocalDate two = LocalDate.of(2017,5,5);
        Period oneTwo = Period.between(two,one);
        System.out.println(oneTwo);
    }

}
