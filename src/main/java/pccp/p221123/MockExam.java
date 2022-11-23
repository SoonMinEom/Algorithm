package pccp.p221123;

import java.util.*;

public class MockExam {
    public int[] solution(int[] answer) {

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = {0, 0, 0};

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == first[i%first.length]){
                cnt[0]++;
            }

            if (answer[i] == second[i%second.length]){
                cnt[1]++;
            }

            if (answer[i] == third[i%third.length]){
                cnt[2]++;
            }
        }

        int max = 0;
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] > max) {
                max = cnt[i];
            }
        }

        List<Integer> result = new ArrayList<>();

        if(cnt[0] == max ) result.add(1);
        if(cnt[1] == max ) result.add(2);
        if(cnt[2] == max ) result.add(3);

        int[] winner = new int[result.size()];

        for (int i = 0; i < winner.length; i++) {
            winner[i] = result.get(i);
        }

        return winner;
    }

    public static void main(String[] args) {
        int[] answer = {1,3,2,4,2};
        MockExam mockExam = new MockExam();
        System.out.println(Arrays.toString(mockExam.solution(answer)));
    }
}
