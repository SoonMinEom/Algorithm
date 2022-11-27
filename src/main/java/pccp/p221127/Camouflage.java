package pccp.p221127;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public int solution(String[][] clothes) {

        // 각 부위 별로 몇개의 의상이 있는지 체크
        Map<String, Integer> clothesMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            if (!clothesMap.containsKey(clothes[i][1])) {
                clothesMap.put(clothes[i][1],1);
            } else {
                clothesMap.put(clothes[i][1],clothesMap.get(clothes[i][1])+1);
            }
        }

        // 곱하기로 답을 구하기 때문에 첫값은 1로
        int answer = 1;

        // A 부위에 의상이 "a, b, c" 3개라면, A 부위 선택지는 "a, b, c, 안 입기"로 총 4개가 됨
        // 즉, 위장의 전체 경우의 수는 각 value에 1을 더한 값을 곱하기 하면 됨.
        for (Integer value : clothesMap.values()) {
            answer *= (value+1);
        }

        // 단, 모든 부위에 의상을 입지 않으면 안되기 때문에 -1을 해줌
        answer--;

        return answer;
    }

    public static void main(String[] args) {
        String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        Camouflage s = new Camouflage();
        System.out.println(s.solution(arr));
    }
}
