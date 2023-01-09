package programers.level_0.part1;
//https://school.programmers.co.kr/learn/courses/30/lessons/120921

public class 문자열밀기 {
    public static int solution(String A, String B) {

        StringBuilder origin = new StringBuilder(A);
        int answer = 0;

        if (origin.toString().equals(B)) return answer;

        for (int i = 0; i < origin.length(); i++) {
            char temp = origin.charAt(origin.length()-1);
            origin.deleteCharAt(origin.length()-1);
            origin.insert(0,temp);
            answer++;
            if (origin.toString().equals(B)) break;
        }

        if (answer == origin.length()) answer =-1;

        return answer;
    }

    public static void main(String[] args) {
        int nums = solution("apple","eappl");
        System.out.println(nums);
    }
}
