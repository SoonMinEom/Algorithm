package onclass2.t221207;

import java.util.PriorityQueue;

public class MoreHot {
    public int solution(int[] scoville, int K) {

        PriorityQueue pq = new PriorityQueue();
        for (int i : scoville) {
            pq.add(i);
        }

        int cnt = 0;
        while (pq.size()>1) {

            int first = (int)pq.poll();
            int second = (int)pq.poll();

            int mix = first+(second*2);
            pq.add(mix);
            cnt++;

            if ((int)pq.peek()>=K) break;

        }

        if ((int)pq.peek()<K) cnt =-1;

        return cnt;

    }
}
