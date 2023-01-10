package programers.level_0.part2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120892

public class 암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] chars = cipher.toCharArray();
        for (int i = code-1; i < chars.length; i += code) {
            answer += chars[i];
        }

        // subString 사용해봐요 좀
        for (int i = code -1 ; i < cipher.length() ; i += code) {
            answer += cipher.substring(i,i+1);
        }
        return answer;
    }
}

