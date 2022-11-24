package pccp.p221124;

import java.util.ArrayList;
import java.util.List;

public class smallestNum {
    public int[] solution(int[] arr) {

        // 배열의 최소값 위치 구하기
        int targetIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[targetIdx] > arr[i]) {
                targetIdx = i;
            }
        }

        // 값을 지우기 위해 리스트로 변환
        List<Integer> toDelete = new ArrayList<>();
        for (int i : arr) {
            toDelete.add(i);
        }

        // 최소값 지우기
        toDelete.remove(targetIdx);

        // 최소값 지운 이후, size()가 0이면 -1 배열 리턴
        if(toDelete.size() == 0) {
            int[] answer = {-1};
            return answer;
        }

        // 다시 배열로 변환
        int[] answer = new int[toDelete.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = toDelete.get(i);
        }

        return answer;
    }
}
