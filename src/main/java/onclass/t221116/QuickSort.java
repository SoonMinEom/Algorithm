package onclass.t221116;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] arr) {

        int pivotIdx = arr.length/2;
        int leftIdx = 0;
        int rightIdx = arr.length-1;

        while (arr[leftIdx] < arr[pivotIdx]) {
            System.out.printf("leftIdx : %d, value : %d, pivot : %d\n", leftIdx, arr[leftIdx], arr[pivotIdx] );
            leftIdx++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};

        QuickSort qs = new QuickSort();
        qs.sort(arr);

    }
}
