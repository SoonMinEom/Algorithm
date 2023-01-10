package programers.level_0.part2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120895

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        char[] chars = my_string.toCharArray();
        char temp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = temp;

        String answer = new String(chars);
        return answer;
    }
}
