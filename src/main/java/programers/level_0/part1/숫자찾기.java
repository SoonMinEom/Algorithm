package programers.level_0.part1;
// https://school.programmers.co.kr/learn/courses/30/lessons/120904

public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;
        String number = String.valueOf(num);
        if (number.contains(String.valueOf(k))) {
            answer = number.indexOf(String.valueOf(k))+1;
        } else {
            answer = -1;
        }
        return answer;
    }
}
