package programers.level_0.part2;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/120891
public class 삼육구게임 {
    public int solution(int order) {
        int answer = 0;
        while (order > 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer++;
            order /= 10;
        }
        return answer;
    }
}
