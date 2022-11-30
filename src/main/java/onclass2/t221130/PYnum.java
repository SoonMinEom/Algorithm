package onclass2.t221130;
//https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class PYnum {
    boolean solution(String s) {
        boolean answer = true;

        int pcnt = 0;
        int ycnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' ||s.charAt(i) == 'P') pcnt++;
            if (s.charAt(i) == 'y' ||s.charAt(i) == 'Y') ycnt++;
        }

        if (pcnt != ycnt) answer = false;

        return answer;
    }
}
