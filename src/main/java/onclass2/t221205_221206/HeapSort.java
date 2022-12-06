package onclass2.t221205_221206;

import java.util.Arrays;

public class HeapSort {
    public static int[] makeHeap(int[] arr, int parentIdx, int arrSize){
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        // 왼쪽 자식이 부모보다 큰 경우
        if(leftIdx < arrSize && arr[leftIdx] > arr[greaterIdx] ){
            greaterIdx = leftIdx;
        }

        // 오른쪽 자식이 greater 보다 크면
        if(rightIdx < arrSize && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        // 바꾸기
        if (parentIdx != greaterIdx) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
            makeHeap(arr, greaterIdx, arrSize);
        }


        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,5,8,3,2,4,6,7,1};

        for (int j = 0 ; j < arr.length ; j++) {

            for (int i = (arr.length-2) / 2; i >=0 ; i--) {
                System.out.println(Arrays.toString(makeHeap(arr,i, arr.length-j)));
            }

            int temp = arr[0];
            arr[0] = arr[arr.length-(j+1)];
            arr[arr.length-(j+1)] = temp;
            System.out.println(Arrays.toString(arr));
        }
//
//        for (int i = (arr.length-2) / 2; i >=0 ; i--) {
//            System.out.println(Arrays.toString(makeHeap(arr,i, arr.length)));
//        }
//
//        int temp = arr[0];
//        arr[0] = arr[arr.length-1];
//        arr[arr.length-1] = temp;
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = (arr.length-2) / 2; i >=0 ; i--) {
//            System.out.println(Arrays.toString(makeHeap(arr,i, arr.length-1)));
//        }
//
//        temp = arr[0];
//        arr[0] = arr[arr.length-2];
//        arr[arr.length-2] = temp;
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = (arr.length-2) / 2; i >=0 ; i--) {
//            System.out.println(Arrays.toString(makeHeap(arr,i, arr.length-2)));
//        }






    }
}
