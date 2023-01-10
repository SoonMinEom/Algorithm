package programers.level_0.part2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120896


import java.util.Arrays;
import java.util.Set;


public class 한번만등장한문자 {

    public String solution(String s) {
        // 방법 1
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length ; i++) {
            int cnt = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) cnt ++;
                if (cnt == 2) break;
            }
            if (cnt == 1) answer += chars[i];
        }

        return answer;
    }
}
