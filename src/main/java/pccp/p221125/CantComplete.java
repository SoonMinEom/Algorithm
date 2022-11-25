package pccp.p221125;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CantComplete {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> part = new HashMap<>();

        for (String p : participant) {
            if(part.get(p) == null) part.put(p,1);
            else part.put(p,part.get(p)+1);
        }

        for (String c : completion) {
           part.put(c, part.get(c)-1);
        }

        String answer = "";

        for (String s : part.keySet()) {
            if(part.get(s) > 0) answer=s;
        }

        return answer;
    }
}
