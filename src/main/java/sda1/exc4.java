package sda1;

public class exc4 {
    public static void table2(int[] tab) {
//        int [] newtab = new int [3];
        int temp = tab[0];
        tab[0] = tab[2];
        tab[2] = temp;
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
