package onclass.t221122;

import java.util.Scanner;

public class RecursionPlus2 {

    public static long sum(long num) {
        if(num == 0) return 0;
        return num%10 + sum(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(sum(num));
    }
}
