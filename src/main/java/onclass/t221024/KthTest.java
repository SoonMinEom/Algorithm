package onclass.t221024;

import java.util.Arrays;

public class KthTest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4 };
//        int[] arr1 = Arrays.copyOfRange(arr, 2-1, 5 );
//
//        System.out.println(Arrays.toString(arr1));

        int length = 1;
        for (int i = arr.length; i > 0 ; i--) {
            length *= i;
        }
        System.out.println(length);
    }
}
