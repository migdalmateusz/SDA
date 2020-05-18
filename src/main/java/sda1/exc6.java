package sda1;

public class exc6 {
    public static int [] negativeNumber (int[] tab) {
        int count = 0;
        for (int number:tab) {
            if (number <0) {
                count++;
            }
        }
        int [] newTab = new int[count];
        int j=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]<0) {
                newTab[j] = tab [i];
                j++;
            }
        }

        return newTab;
    }
}
