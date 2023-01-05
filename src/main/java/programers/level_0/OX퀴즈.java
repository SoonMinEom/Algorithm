package programers.level_0;
// https://school.programmers.co.kr/learn/courses/30/lessons/120907

import java.util.Arrays;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            if (split[1].equals("+")) {
                if (Integer.valueOf(split[0])+Integer.valueOf(split[2]) == Integer.valueOf(split[4])) answer[i] = "O";
                else answer[i] = "X";
            } else {
                if (Integer.valueOf(split[0])-Integer.valueOf(split[2]) == Integer.valueOf(split[4])) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] quiz = {"1 + -2 = -1"};
        OX퀴즈 o = new OX퀴즈();
        System.out.println(Arrays.toString(o.solution(quiz)));
    }
}
