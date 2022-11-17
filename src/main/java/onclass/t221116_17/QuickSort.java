package onclass.t221116_17;

import java.util.Arrays;

public class QuickSort {
    public int[] sort(int[] arr, int startIdx, int endIdx) {

        int pivot = arr[arr.length/2];
        int leftIdx = 0;
        int rightIdx = arr.length-1;


        while ( leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx++;
//            System.out.printf("leftIdx : %d , value : %d \n", leftIdx, arr[leftIdx]);

            while (arr[rightIdx] > pivot) rightIdx--;
//            System.out.printf("rightIdx : %d , value : %d \n", rightIdx, arr[rightIdx]);

            System.out.printf("leftIdx : %d , rightIdx : %d\n", leftIdx, rightIdx);
            System.out.println(Arrays.toString(arr));

            int temp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = temp;

            if(leftIdx>=rightIdx) {
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};

        QuickSort qs = new QuickSort();
//        qs.sort(arr);

    }
}
