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

            // toArray() 메소드를 사용해서 List -> Array 변환.
            // int[]는 원시타입 Array 이므로 추가작업 필요.
//        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i]=answerList.get(i);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public int[] solution2(int []arr) {

        Stack<Integer> answerStack = new Stack<>();

        answerStack.push(arr[0]);
        for (int i : arr) {
            if(answerStack.peek() != i) {
                answerStack.push(i);
            }
        }

        int[] answer = new int[answerStack.size()];

        for (int i = answerStack.size()-1 ; i >= 0 ; i--) {
            answer[i] = answerStack.pop();
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        HateSameNum hsn = new HateSameNum();
        hsn.solution2(arr);
    }

}
