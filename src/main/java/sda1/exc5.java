package sda1;

public class exc5 {
    public static int[] minMax(int[] tab) {
        int min = tab[0];
        int max = tab[0];
        int [] tab2 = new int[2];
        for (int number:tab) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        tab2 [0] = min;
        tab2 [1] = max;
        return tab2;
    }
}
