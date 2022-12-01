package programers.level_0;

public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int plusSum = 0;
        for (int i = 0; i < num; i++) {
            plusSum += i;
        }

        int first = (total-plusSum)/num;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = first++;
        }

        return answer;
    }
}
