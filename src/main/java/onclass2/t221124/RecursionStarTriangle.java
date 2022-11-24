package onclass2.t221124;

import java.util.Scanner;

public class RecursionStarTriangle {
    public static String star(int n) {
        if (n == 0 ) return "";
        return "*"+star(--n);
    }
    public static void solution(int n, int start) {
        if (start > n) return;
        System.out.println(star(start++));
        solution(n, start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt(), 1);
    }
}
