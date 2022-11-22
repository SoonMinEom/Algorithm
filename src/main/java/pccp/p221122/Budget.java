package pccp.p221122;

import java.util.PriorityQueue;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        PriorityQueue pq = new PriorityQueue<>();
        for (int i : d) {
            pq.add(i);
        }

        while (pq.size() > 0) {
            budget -= (int) pq.poll();
            if(budget < 0) {
                break;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3};
        int num = 9;
        Budget budget = new Budget();
        System.out.println(budget.solution(arr, 10));
    }
}
