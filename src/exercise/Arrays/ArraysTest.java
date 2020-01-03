package exercise.Arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String line="cenieurvBUBFCT";
        char[] a=line.toCharArray();
        Arrays.sort(a);
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
