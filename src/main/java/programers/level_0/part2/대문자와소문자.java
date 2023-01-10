package programers.level_0.part2;

public class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 97) {
                char temp = (char) (my_string.charAt(i) - 32);
                answer += temp;
            } else {
                char temp = (char) (my_string.charAt(i) + 32);
                answer += temp;
            }
        }

        return answer;
    }
}
