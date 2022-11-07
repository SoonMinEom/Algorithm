package onclass.t221107;

import java.util.Arrays;

public class Harshad {
    public boolean solution(int x) {

        int origin = x;

        // 각 자리의 숫자 합 구하기
        int sumOfDigit = 0;

        while (x>0) {
            // 맨 끝(1의 자리)부터 각 자리 숫자의 합에 더해짐.
            sumOfDigit += x%10;
            // 더해진 1의 자리를 버림.
            x = x/ 10;
        }

        // 각 자릿수 더한 값으로 원래 수 나눠 보기
        if (origin % sumOfDigit == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Harshad s = new Harshad();
        System.out.println(s.solution(10));
    }
}
