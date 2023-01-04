package programers.level_0;
// https://school.programmers.co.kr/learn/courses/30/lessons/120909

public class 제곱수판별하기 {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }

//        int answer = 2;
//
//        for (int i = 1; i <= n/2; i++) {
//            if (i*i == n) {
//                answer = 1;
//                break;
//            }
//        }
//
//        return answer;
    }
}
