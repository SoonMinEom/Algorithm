package onclass.t221107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            answer = new int[1];
            answer[0] = -1;
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

    public static void main(String[] args) {
        DividableNum dn = new DividableNum();
        int[] a = {5,9,7,10};
        System.out.println(Arrays.toString(dn.solution(a,5)));
    }
}
