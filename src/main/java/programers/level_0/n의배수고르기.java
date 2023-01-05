package programers.level_0;
// https://school.programmers.co.kr/learn/courses/30/lessons/120905

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        // 보고 배운 방법 2
        //return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();

        List<Integer> answerList = new ArrayList<>();

        for (int i : numlist) {
            if (i%n==0) answerList.add(i);
        }

        // 보고 배운 방법 1
        //return answerList.stream().mapToInt(num -> num).toArray();

        int[] answer = new int[answerList.size()];
        int idx = 0;
        for (Integer integer : answerList) {
            answer[idx++] = integer;
        }
        return answer;
    }
}
