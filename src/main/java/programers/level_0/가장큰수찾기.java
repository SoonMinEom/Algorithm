package programers.level_0;
// https://school.programmers.co.kr/learn/courses/30/lessons/120899


public class 가장큰수찾기 {

    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                idx = i;
            }
        }
        answer[0] = max;
        answer[1] = idx;
        return answer;
    }
}
