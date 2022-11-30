package onclass2.t221130;
//https://school.programmers.co.kr/learn/courses/30/lessons/12928

import java.util.ArrayList;
import java.util.List;

public class FactorsSum {
    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i*i <=n  ; i++) {
            if (n % i == 0) {
                answer += i;
                if(i != n/i) answer += n/i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FactorsSum fs = new FactorsSum();
        System.out.println(fs.solution(12));
    }
}
