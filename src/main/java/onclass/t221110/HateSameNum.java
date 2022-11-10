package onclass.t221110;

import java.util.*;
//실패..
public class HateSameNum {
    public int[] solution(int []arr) {

        List<Integer> answerList = new ArrayList<>();

        answerList.add(arr[0]);
        for (int i : arr) {
           if (answerList.get(answerList.size()-1) != i) {
               answerList.add(i);
           }
        }

//        System.out.println(answerList);

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        HateSameNum hsn = new HateSameNum();
        hsn.solution(arr);
    }

}
