package onclass2.t221124;

import java.util.Scanner;

public class RecursionNumTriangle {
    public static String num(int n) {
        if (n == 1 ) return n+"";
        return num(n-1) + " " +n;
    }
    public static void solution(int n, int start) {
        if (start > n) return;
        System.out.println(num(start++));
        solution(n, start);
    }

    public static void solution2(int n) {
        if (n == 0) return;
        solution2(n-1);
        System.out.println(num(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        solution(sc.nextInt(), 1);
        solution2(sc.nextInt());
    }
}
