package programers.level_0.part2;

public class A로B만들기 {
    public int solution(String before, String after) {
        // 방법 1
        int answer = 1;
        for (int i = 0; i < before.length(); i++) {
            String temp = before.charAt(i)+"";
            if (after.contains(temp)) {
                after = after.replaceFirst(temp, "");
            } else {
                answer = 0;
                break;
            }
        }

        // 방법 2
        return answer;
    }
}
