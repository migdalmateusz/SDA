package mz2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc3 {

    public static boolean login (String number) {
        Pattern pattern = Pattern.compile("[[A-Z][a-z][0-9]]{8,16}");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
