package programers.level_0.part2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120890

import java.util.Arrays;

public class 가까운수 {
    public int solution(int[] array, int n) {
        Arrays.sort(array);

        int[] abs = new int[array.length];
        for (int i = 0; i < abs.length; i++) {
            abs[i] = Math.abs(array[i] - n);
        }

        int answer = 0;
        int min = 100;
        for (int i = 0; i < abs.length; i++) {
            if (min > abs[i]) {
                min = abs[i];
                answer = array[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가까운수 t = new 가까운수();
        int[] a = { 3, 12, 10, 28};

        System.out.println(t.solution(a, 20));
    }
}
