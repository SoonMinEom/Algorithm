package programers.level_0.part1;
// https://school.programmers.co.kr/learn/courses/30/lessons/120906

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}
