package programers.level_0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120913
public class 잘라서배열로저장하기 {
    public static String[] solution(String my_str, int n) {
        List<String> sub = new ArrayList<>();

        while (my_str.length()>n) {
            sub.add(my_str.substring(0,n));
            my_str = my_str.substring(n);
        }
        sub.add(my_str);

        String[] answer = sub.toArray(new String[sub.size()]);

        return answer;
    }

    public static void main(String[] args) {
        solution("abc1Addfggg4556b",6);
    }
}
