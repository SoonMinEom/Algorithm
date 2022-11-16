package onclass.t221116;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] arr) {

        int pivot = arr[arr.length/2];
        int leftIdx = 0;
        int rightIdx = arr.length-1;

        while (arr[leftIdx] < pivot) leftIdx++;
        System.out.println(leftIdx);

        while (arr[rightIdx] > pivot) rightIdx--;
        System.out.println(rightIdx);

        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
        leftIdx ++;
        rightIdx --;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};

        QuickSort qs = new QuickSort();
        qs.sort(arr);

    }
}
