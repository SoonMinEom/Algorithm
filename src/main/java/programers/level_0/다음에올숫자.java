package programers.level_0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120924

public class 다음에올숫자 {
    public static int solution(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1])
            answer = common[common.length-1] + (common[1] - common[0] );
        else
            answer = common[common.length-1]*(common[1]/common[0]);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solution(arr);
    }
}
