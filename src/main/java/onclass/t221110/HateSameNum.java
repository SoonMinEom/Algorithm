package onclass.t221110;

import java.util.*;
//실패..
public class HateSameNum {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.empty()) {
                stack.push(i);
            } else if (stack.peek() != i) {
                stack.push(i);
            }
        }

        int[] answer = {};

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.peek());
        }


        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        HateSameNum hsn = new HateSameNum();
        hsn.solution(arr);
    }

}
