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
//            answer = new int[answerlist.size()];
//            int idx = 0;
//            for (Integer integer : answerlist) {
//                answer[idx++] = integer;
//            }
            // List 를 array 로 바꾸자!! ->.toArray() 사용하면 됨.
            // but, array가 int와 같은 원시 타입인 경우, 아래와 같은 추가 작업 필요.
            answer = answerlist.stream().mapToInt(Integer::intValue).toArray();
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
        System.out.println(Arrays.toString(dn.solution(a,5)));
    }
}
