package at.htl.utils;

public class MyUtils {

    public static int getMin(int ... zahlen) {
        int result = zahlen[0];
        for (int i=1; i<zahlen.length; i++) {
            if (zahlen[i] > result) {
                result = zahlen[i];
            }
        }
        return result;
    }
}
