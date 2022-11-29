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
    public static int[] maxDigit(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (i !=0) set.add((int)(Math.log10(i)+1));
        }

        int idx = 0;
        int[] digit = new int[set.size()];
        for (Integer integer : set) {
            digit[idx++] = integer;
        }
        return digit;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0,23,520};
        RadixSort rs = new RadixSort();
//        rs.sort(arr);
        System.out.println(Arrays.toString(rs.maxDigit(arr)));
    }
}
