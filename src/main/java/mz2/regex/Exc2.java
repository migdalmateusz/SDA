package mz2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc2 {
    public static boolean zipCode (String number) {
        Pattern pattern = Pattern.compile("\\d{2}-\\d{3}");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
