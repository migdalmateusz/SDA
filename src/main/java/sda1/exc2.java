package sda1;

public class exc2 {
    public static boolean primeNumber(int a) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                prime = false;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}
