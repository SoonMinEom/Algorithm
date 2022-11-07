package onclass.t221107;

public class Solution {
    public boolean solution(int x) {
        // 숫자 길이 구하기
        String temp = String.valueOf(x);
        int length = temp.length();

        // 10^(길이 -1) 부터 나누고 빼서, 각 자릿수 구하고 더하기


        // 각 자릿수 더한 값으로 원래 수 나눠 보기

        System.out.println(length);
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(15);
    }
}
