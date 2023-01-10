package programers.level_0.part2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120889

public class 삼각형의완성조건 {
    public int solution(int[] sides) {
        int max = 0;
        for (int side : sides) {
            if (side > max) max = side;
        }

        int total = 0;
        for (int side : sides) {
            total += side;
        }

        int answer = 0;
        if (total-max > max) answer = 1;
        else answer =2;

        return answer;
    }
}
