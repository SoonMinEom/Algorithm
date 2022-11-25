package pccp.p221125;

import java.util.*;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = 0;
                    reserve[j] = 0;
                }
            }
        }

        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) {
            if ( i != 0) lostList.add(i);
        }

        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) {
            if ( i != 0) reserveList.add(i);
        }

        lostList.sort(Comparator.naturalOrder());
        reserveList.sort(Comparator.naturalOrder());

        answer -= lostList.size();

        for (int i = 0; i < reserveList.size(); i++) {
            if (lostList.size() == 0 ) break;
            for (int j = 0; j < lostList.size(); j++) {
                if (reserveList.get(i) == lostList.get(j)+1 || reserveList.get(i) == lostList.get(j)-1) {
                    answer++;
                    lostList.remove(j);
                    j--;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        GymSuit gymSuit = new GymSuit();

        int[] lost = {2, 3, 5};
        int[] reserve = {1, 3, 5};
        System.out.println(gymSuit.solution(5, lost, reserve));
    }
}
