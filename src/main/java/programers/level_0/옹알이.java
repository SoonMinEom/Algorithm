package programers.level_0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120956

import java.util.Arrays;

public class 옹알이 {
    public static int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < possible.length; j++) {
                babbling[i] = babbling[i].replaceFirst(possible[j]," " );
            }
        }

        System.out.println(Arrays.toString(babbling));

        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].isBlank()) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(arr));
    }
}
