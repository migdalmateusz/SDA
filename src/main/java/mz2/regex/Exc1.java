package mz2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc1 {

    public static void ifNumber (String number) {
        Pattern pattern = Pattern.compile("-?[0-9]+");
        Pattern pattern2 = Pattern.compile("-?[0-9]+[02468]");
        Matcher matcher = pattern.matcher(number);
        Matcher matcher2 = pattern2.matcher(number);
        if (matcher.matches()) {
            if (matcher2.matches()) {
                System.out.println("Liczba jest parzysta");
            } else {
                System.out.println("Liczba jest nieparzysta");
            }
        } else {
            System.out.println("To nie jest liczba");
        }
    }
}
