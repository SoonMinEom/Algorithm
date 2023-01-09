package programers.level_0.part1;
// https://school.programmers.co.kr/learn/courses/30/lessons/120910

public class 세균증식 {
    public int solution(int n, int t) {
        int answer = n * (int) Math.pow(2, t);
        return answer;
    }
}
