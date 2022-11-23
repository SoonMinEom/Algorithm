package onclass2.t221123;

import java.util.Scanner;

public class RecursionNumber {
    public static void print(int n, int start) {
        if (start > n ) {
            return;
        }
        int print = start;
        System.out.print(start++ +" ");
        print(n, start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num, 1);
    }
}
