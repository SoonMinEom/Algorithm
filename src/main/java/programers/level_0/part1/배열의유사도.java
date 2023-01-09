package programers.level_0.part1;

public class 배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s1) {
            for (String ss : s2) {
                if (s.equals(ss)) answer++;
            }
        }
        return answer;
    }

}
