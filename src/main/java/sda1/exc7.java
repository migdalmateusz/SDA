package sda1;

public class exc7 {
    public static int [] arithmeticString (int a, int b, int c) {
        int [] newTab = new int [a];
        newTab [0] = b;
        for (int i = 1; i <a ; i++) {
            newTab [i] = b+i*c;
        }
        return newTab;
    }
}