package sda1;

public class exc9 {
    public static int moduloVersion(int a, int b) {
        int sum = 0;
        while (sum <= a) {
            sum = sum + b;
        }
        int c = a-(sum - b);
        return c;
    }
}