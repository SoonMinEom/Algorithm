package onclass2.t221129;

import java.util.Arrays;

public class RadixSort {
    public void sort(int[] arr) {
        int[] sortedArr = new int[10];

        for (int i : arr) {
            sortedArr[i] =i;
            }

        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] == i) {
                System.out.println(sortedArr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};
        RadixSort rs = new RadixSort();
        rs.sort(arr);
    }
}
