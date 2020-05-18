package sda1;

public class exc10 {
    public static boolean ifModuloVersion(int a, int b) {
        int c = a%b;
        boolean newModulo = true;
        if (exc9.moduloVersion(a,b)!=c) {
            newModulo = false;
        }
        return newModulo;
    }
}