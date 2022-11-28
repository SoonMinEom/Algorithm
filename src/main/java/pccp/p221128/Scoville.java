package pccp.p221128;

import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {
        PriorityQueue pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.add(i);
        }

        int cnt = 0;
        while ((int) pq.peek()<K) {
            if(pq.size() == 1 ) {
                cnt = -1;
                break;
            }
            int first = (int) pq.poll();
            int second = (int) pq.poll();

            int answer = first + (second*2);
            pq.add(answer);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scoville s = new Scoville();
        int[] arr = {0,1,2,3,9,10,12};
        System.out.println(s.solution(arr,7));
    }
}
