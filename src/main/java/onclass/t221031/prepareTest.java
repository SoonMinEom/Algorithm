package onclass.t221031;

import java.util.*;

public class prepareTest {

    public List<Integer> solution(int[] answers) {
        int[] answerss = {};

        int[] cnt = {0,0,0};
//        Map<Integer, Integer> cnt = new HashMap<>();

//        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i%arr1.length]) {
                cnt[0]++;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr2[i%arr2.length]) {
                cnt[1]++;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr3[i%arr3.length]) {
                cnt[2]++;
            }
        }

        Map<Integer, Integer> cntMap = new HashMap<>();
        cntMap.put(1,cnt[0]);
        cntMap.put(2,cnt[1]);
        cntMap.put(3,cnt[2]);

        // max 구하기
        int max = 0;

        for (Integer value : cntMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        // max와 같은 value를 가진 key값을 List에 추가
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            if (max == cntMap.get(i)) {
                answer.add(i);
            }
        }

//        System.out.println(answer);
//        System.out.println(Arrays.toString(cnt));
        return answer;
    }

    public static void main(String[] args) {
        prepareTest pt = new prepareTest();
        int[] answers = {1,3,2,4,2,1,4,2,5,3,2,2,3,4,5,1,2,3,4,5,2};
        pt.solution(answers);
    }
}
