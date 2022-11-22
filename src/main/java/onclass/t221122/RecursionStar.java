package onclass.t221122;

import java.util.Scanner;

public class RecursionStar {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        n--;
        print(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
