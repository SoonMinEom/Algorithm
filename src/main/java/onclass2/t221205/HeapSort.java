package onclass2.t221205;

import java.util.Arrays;

public class HeapSort {
    public static void childIdx(int num) {
        System.out.printf("leftIdx : %d\n", 2*num+1);
        System.out.printf("rightIdx : %d", 2*num+2);
    }
    public static int[] sort(int[] arr, int parentIdx){
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        // 왼쪽 자식이 부모보다 큰 경우
        if(leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx] ){
            greaterIdx = leftIdx;
        }

        // 오른쪽 자식이 greater 보다 크면
        if(rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        // 바꾸기
        int temp = arr[parentIdx];
        arr[parentIdx] = arr[greaterIdx];
        arr[greaterIdx] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,7,8};
        System.out.println(Arrays.toString(sort(arr,1)));
    }
}
