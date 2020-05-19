package mz2.regex;

import java.util.Scanner;

import static mz2.regex.Exc1.ifNumber;
import static mz2.regex.Exc2.zipCode;
import static mz2.regex.Exc3.login;

public class Mz2RegexMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
//        ifNumber(number);
//        System.out.println(zipCode(number));
        System.out.println(login(number));
    }
}
