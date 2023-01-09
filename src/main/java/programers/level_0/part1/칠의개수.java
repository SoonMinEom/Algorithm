package programers.level_0.part1;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120912
public class 칠의개수 {
    public static int solution(int[] array) {
        int cnt = 0;

        for (int i = 0; i < array.length ; i++) {
            String check = String.valueOf(array[i]);
            for (int j = 0; j < check.length(); j++) {
                if (check.charAt(j) == '7') cnt++;
            }
        }
        return cnt;
    }

    public static int solution2(int[] array) {
        int cnt = 0;

        for (int a : array) {
            while (a > 0) {
                if (a % 10 ==7) cnt++;
                a /= 10;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] arr = {7, 77, 17};
        System.out.println(solution(arr));
    }
}
