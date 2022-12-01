package onclass2.t221201;
//명예의 전당
//https://school.programmers.co.kr/learn/courses/30/lessons/138477


import java.util.*;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            if (i < k) pq.add(score[i]);
            else {
                if (pq.peek() < score[i]) {
                    pq.poll();
                    pq.add(score[i]);
                }
            }
            answer[i] = pq.peek();
        }

        return answer;
    }

    public int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hof = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            hof.add(score[i]);
            Collections.sort(hof);
            if(hof.size()<=k) answer[i] = hof.get(0);
            else {
                answer[i] = hof.get(hof.size()-k);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int k = 4;
        HallOfFame hof = new HallOfFame();
        System.out.println(Arrays.toString(hof.solution(k,score)));
        System.out.println(Arrays.toString(hof.solution2(k,score)));
    }
}
