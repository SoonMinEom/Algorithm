package onclass2.t221129;

import java.util.*;

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

    //큐배열에 담기
    public static int[] queueArr(int[] arr, int digit) {
        // 10칸짜리 큐 배열 만들기
        Queue<Integer>[] qa = new Queue[10];
        for (int i = 0; i < qa.length ; i++) {
            qa[i] = new ArrayDeque<>();
        }

        // 자릿수에 맞는 큐에 넣기.
        for (int i = 0; i < arr.length; i++) {
            int divisor = (int)Math.pow(10,digit-1);
            qa[Math.floorDiv(arr[i],divisor)%10].add(arr[i]);
        }

        //다시 배열로 돌리기
        int idx = 0;
        for (int i = 0; i < qa.length; i++) {
            while (!qa[i].isEmpty()) {
                arr[idx++] =qa[i].poll();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 1, 0, 20};
        int[] digits = maxDigit(arr);
        System.out.println(Arrays.toString(maxDigit(arr)));

        for (int digit : digits) {
            queueArr(arr,digit);
        }

        System.out.println(Arrays.toString(arr));
    }
}
