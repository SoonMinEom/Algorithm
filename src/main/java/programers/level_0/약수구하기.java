package programers.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 약수구하기 {
    public static int[] solution(int n) {
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i * i <= n ; i++) {
            if (n % i == 0) {
                divisor.add(i);
                if ( i != n/i) {
                    divisor.add(n/i);
                }
            }
        }
        int[] answer = divisor.stream().mapToInt(num -> num).toArray();
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(약수구하기.solution(1)));
    }
}
