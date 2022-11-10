package onclass.t221110;

import java.util.*;
//실패..
public class HateSameNum {
    public int[] solution(int[] arr) {

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

        // 반복문 사용으로 List -> Array변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i]=answerList.get(i);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    // Stack 사용 풀이. 원리는 같음.
    public int[] solution2(int[] arr) {

        Stack<Integer> answerStack = new Stack<>();

        answerStack.push(arr[0]);
        for (int i : arr) {
            if(answerStack.peek() != i) {
                answerStack.push(i);
            }
        }

        int[] answer = new int[answerStack.size()];

        // pop은 마지막 것 부터 나오므로, Index를 거꾸로
        for (int i = answerStack.size()-1 ; i >= 0 ; i--) {
            answer[i] = answerStack.pop();
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public void solution3(int[] arr) {

        List<Integer> answerList = new ArrayList<>();

        answerList.add(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] != arr[i-1]) {
                answerList.add(arr[i]);
            }
        }

        System.out.println(answerList);
    }

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        HateSameNum hsn = new HateSameNum();
        hsn.solution(arr);
        hsn.solution2(arr);
        hsn.solution3(arr);
    }

}
