package onclass.t221115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public void solution(int[] arr) {
        // 1. 기준값 뽑는 로직 구현
        int pivot = arr.length/2;

        // 2. 기준값 기준으로 왼쪽 오른쪽에 남아서 담는 로직(3개의 List에)
       List<Integer> smaller = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();

        for (int i : arr) {
            if(i < arr[pivot]) {
                smaller.add(i);
            } else if (i > arr[pivot]) {
                bigger.add(i);
            } else {
                middle.add(i);
            }
        }

        System.out.println("smaller : " + smaller);
        System.out.println("bigger : " + bigger);
        System.out.println("middle : " + middle);

    }

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        QuickSort qs = new QuickSort();
        qs.solution(arr);


    }
}
