package onclass.t221027;
//완주하지 못한 선수

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> parts = new HashMap<>();


        // 완주자 명단 만들기, 이름 하나가 완주할때마다 value +1
        for (String comp : completion) {
            if (parts.get(comp) == null) {
                parts.put(comp, 1);
            } else {
                parts.put(comp, parts.get(comp)+1);
            }
        }

        // 만들어진 완주자 명단에서 참가자 이름 하나가 발견될때마다 value -1
        for (String part : participant) {
            // 참가자 이름을 완주자 명단에서 발견하지 못한 경우 = 완주하지 못한 선수
            if (parts.get(part) == null) {
                answer = part;
            } else {
                // 참가 = 완주면 value는 0 이되고, 참가했는데 완주하지 못했으면(참가>완주)면 value는 음수가 됨.
                parts.put(part, parts.get(part)-1);
                if (parts.get(part) < 0) {
                    answer = part;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"eden", "kiki"};
        System.out.println(s.solution(a,b));
    }
}
