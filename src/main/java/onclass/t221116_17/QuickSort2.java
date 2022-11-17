package onclass.t221116_17;

import java.util.Arrays;

public class QuickSort2 {
    public int[] sort(int[] arr) {

        // 교환의 기준이 될 pivot 값(배열의 중간값) 선언.
        int pivot = arr[arr.length/2];

        // 교환 대상을 탐색할 인덱스는 pivot 을 기준으로 왼쪽끝 오른쪽끝으로 나눈다.
        int leftIdx = 0;
        int rightIdx = arr.length-1;

        while (leftIdx <= rightIdx) {

            // 왼쪽끝부터 한 칸씩 오른쪽으로 이동하며 탐색 시작
            // pivot 보다 작은 값일 동안 계속 이동
            // 즉, pivot 보다 크거나 같은 값이 나오면 그 자리에서 기다린다. (= 반복문 종료)
            while (arr[leftIdx] < pivot) leftIdx++;

            // 오른쪽끝부터 한 칸씩 왼쪽으로 이동하며 탐색 시작
            // pivot 보다 큰 값일 동안 계속 이동
            // 즉, pivot 보다 작거나 같은 값이 나오면 그 자리에서 기다린다. (= 반복문 종료)
            while (arr[rightIdx] > pivot) rightIdx--;

            // 멈춰 있는 두 인덱스 값을 서로 교환
            // = pivot 보다 큰 값은 오른쪽으로, pivot 보다 작은 값은 왼쪽으로 서로 교환 됨.
            int temp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = temp;

            // 교환이 발생한 이 후에도 한 칸씩 인덱스 이동 발생.
            // 반복문 탈출 조건을 만들기 위함.
            leftIdx++;
            rightIdx--;

            // 위 과정을, leftIdx <= rightIdx 동안에만 반복.
            // -> 즉, leftIdx > rightIdx 면 반복 종료 ( 두 인덱스가 서로 교차 )
            // -> 즉, 왼쪽에서의 탐색, 오른쪽에서의 탐색이 끝날 때까지.

        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        QuickSort2 qs = new QuickSort2();

        System.out.println(Arrays.toString(qs.sort(arr)));
    }
}
