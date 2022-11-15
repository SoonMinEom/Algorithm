package onclass.t221115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    // 다시합치고 재귀 하는건 실패
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

        // 다시 하나의 배열로 합치기! -> 실패
        int[] res = new int[arr.length];
        int resIdx = 0;

        for (Integer integer : smaller) {
            res[resIdx++] = integer;
        }

        for (Integer integer : middle) {
            res[resIdx++] = integer;
        }

        for (Integer integer : bigger) {
            res[resIdx++] = integer;
        }

        System.out.println(Arrays.toString(res));

        if (arr[pivot] == res[pivot]) {
            return;
        }
        solution(res);
    }

    public List<Integer> merge(List<Integer>smaller,List<Integer>middle,List<Integer>bigger) {
       List<Integer> answer = new ArrayList<>();
       answer.addAll(smaller);
       answer.addAll(middle);
       answer.addAll(bigger);

       return answer;
    }

    public List<Integer> sort (List<Integer> arr) {

        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(arr.size()/2);

        List<Integer> smaller = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();

        for (int i : arr) {
            if(i < pivot) {
                smaller.add(i);
            } else if (i > pivot) {
                bigger.add(i);
            } else {
                middle.add(i);
            }
        }

//        System.out.println("smaller : " + smaller);
//        System.out.println("middle : " + middle);
//        System.out.println("bigger : " + bigger);

//        if (smaller.size() ==0 && bigger.size() ==0) {
//            return middle;
//        }

        return merge(sort(smaller),middle,sort(bigger));
    }

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        QuickSort qs = new QuickSort();


        System.out.println(qs.sort(list));


    }
}
