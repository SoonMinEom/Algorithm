package onclass2.t221129;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort {
    // 한 자리수 정렬하기
    public static int[] sort(int[] arr) {
        int[] sortedArr = new int[10];
        for (int i : arr) sortedArr[i] =i;
        return sortedArr;
    }

    //숫자 자릿수 구하기
    public static Set<Integer> maxLength(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (i !=0) set.add((int)(Math.log10(i)+1));
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};
        RadixSort rs = new RadixSort();
        rs.sort(arr);
        rs.maxLength(arr);
    }
}
