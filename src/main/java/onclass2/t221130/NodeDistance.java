package onclass2.t221130;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NodeDistance {
    public static int solution(int a, int b) {
        int cnt = 0;

        List<Integer> blist = new ArrayList<>();
        List<Integer> alist = new ArrayList<>();

        while (a >= 1) {
            alist.add(a);
            a = Math.floorDiv(a, 2);
        }

        while (b >= 1) {
            blist.add(b);
            b = Math.floorDiv(b, 2);
        }

        int target = 0;

        for (Integer integer : alist) {
            if (blist.contains(integer)) {
                target = integer;
                break;
            }
        }

        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i) == target) {
                cnt += i;
            }
        }

        for (int i = 0; i < blist.size(); i++) {
            if (blist.get(i) == target) {
                cnt += i;
            }
        }

        return cnt;
    }

    public static int solution2(int a, int b) {
        if( a > b) {
            return solution2(a/2,b) + 1;
        } else if (a <b) {
            return solution2(a, b/2) +1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution2(sc.nextInt(), sc.nextInt()));

    }
}