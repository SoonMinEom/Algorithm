package onclass.t221109;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // 오름차순 정렬
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.println(Arrays.toString(arr));
        }

        // 내림차순 정렬
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if(arr[minIdx] < arr[j]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.println(Arrays.toString(arr));
        }

//        i = 1;
//        minIdx = i;
//        for (int j = i+1 ; j < arr.length ; j++) {
//            if(arr[midIdx] > arr[j]) {
//                minIdx = j;
//            }
//        }
//
//        temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//
//        System.out.println(Arrays.toString(arr));
//
//        i = 2;
//        minIdx = i;
//        for (int j = i+1 ; j < arr.length ; j++) {
//            if(arr[midIdx] > arr[j]) {
//                minIdx = j;
//            }
//        }
//
//        temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//
//        System.out.println(Arrays.toString(arr));
//
//        i = 3;
//        minIdx = i;
//        for (int j = i+1 ; j < arr.length ; j++) {
//            if(arr[midIdx] > arr[j]) {
//                minIdx = j;
//            }
//        }
//
//        temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//
//        System.out.println(Arrays.toString(arr));
//
//        i = 4;
//        minIdx = i;
//        for (int j = i+1 ; j < arr.length ; j++) {
//            ifarr[midIdx] > arr[j]) {
//                minIdx = j;
//            }
//        }
//
//        temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//
//        System.out.println(Arrays.toString(arr));
//
//        i = 5;
//        minIdx = i;
//        for (int j = i+1 ; j < arr.length ; j++) {
//            if(arr[midIdx] > arr[j]) {
//                minIdx = j;
//            }
//        }
//
//        temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//
//        System.out.println(Arrays.toString(arr));
//
//        i = 6;
//        minIdx = i;
//        for (int j = i+1 ; j < arr.length ; j++) {
//            if(arr[midIdx] > arr[j]) {
//                minIdx = j;
//            }
//        }
//
//        temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//
//        System.out.println(Arrays.toString(arr));

    }
}
