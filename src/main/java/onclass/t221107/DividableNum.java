package onclass.t221107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DividableNum {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> answerlist = new ArrayList<>();

        for (int i : arr) {
            if(i%divisor == 0) {
                answerlist.add(i);
            }
        }
        int[] answer = {};

        if(answerlist.size() ==0) {
//            answer = new int[1];
//            answer[0] = -1;
            // 한 줄로 표현
            answer = new int[] {-1};
        } else {
            answer = new int[answerlist.size()];
            int idx = 0;
            for (Integer integer : answerlist) {
                answer[idx++] = integer;
            }
        }

        Arrays.sort(answer);

        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {

        // 자동으로 오름차순 정렬을 해줌.
        PriorityQueue<Integer> answerlist = new PriorityQueue<>();

        for (int i : arr) {
            if(i%divisor == 0) {
                answerlist.add(i);
            }
        }
        int[] answer = {};

        if(answerlist.size() ==0) {
            answer = new int[] {-1};
        } else {
            answer = new int[answerlist.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = answerlist.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DividableNum dn = new DividableNum();
        int[] a = {5,9,7,10};
        System.out.println(Arrays.toString(dn.solution2(a,5)));
    }
}
