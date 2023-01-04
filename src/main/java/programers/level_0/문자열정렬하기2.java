package programers.level_0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120911
import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        // 소문자로
        my_string = my_string.toLowerCase();

        // char 배열로 만들기
        char[] chars = my_string.toCharArray();
//        char[] chars = new char[my_string.length()];
//        for (int i = 0; i <my_string.length() ; i++) {
//            chars[i] = my_string.charAt(i);
//        }

        // 정렬하기
        Arrays.sort(chars);

        // String 으로 합치기
        String answer = new String(chars);
//        String answer = "";
//        for (char aChar : chars) {
//            answer += aChar;
//        }

        return answer;
    }
}
