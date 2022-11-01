package baekjoon.b221101;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int one = (b%10)*a;
        int two = ((b/10)%10)*a;
        int three = (b/100)*a;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(a*b);
    }
}
