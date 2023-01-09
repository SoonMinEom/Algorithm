package programers.level_0.part1;
// https://school.programmers.co.kr/learn/courses/30/lessons/120908

public class 문자열안에문자열 {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) return 1;
        else return 2;
    }
}
