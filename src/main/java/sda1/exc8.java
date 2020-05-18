package sda1;

public class exc8 {

    public static boolean ifArithmeticString(int[] tab) {
        if (tab.length < 2) {
            System.out.println("To nie jest ciąg");
            return false;
        }
        boolean aString = true;
        int a = tab[1] - tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] - tab[i - 1] != a) {
                aString = false;
                break;
            }
        }
        return aString;
    }
}
