package sda1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class excSaturday {
    public static void helloUsers(String[] names) {
        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }

    public static String shopProducts(String[] products) {
        StringBuilder productsStr = new StringBuilder();
        for (String product : products) {
            productsStr.append(product).append(", ");
        }
        return String.valueOf(productsStr);
    }

    public static void timeNow() {
        LocalTime ldtn = LocalTime.now();
        System.out.println(ldtn);
        LocalTime ldtnt = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(ldtnt);
        DateTimeFormatter lddn = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(lddn.format(LocalDate.now()));
    }

    public static boolean idChceck(String id) {
        Pattern idPattern = Pattern.compile("[0-9]{11}");
        return idPattern.matcher(id).matches();
    }
}

