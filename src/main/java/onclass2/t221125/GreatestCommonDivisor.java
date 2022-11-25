package onclass2.t221125;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if(a == b) return a;
        else if(a > b) return gcd(a-b, b);
        else return gcd(a, b-a);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(gcd(sc.nextInt(),sc.nextInt()));
    }
}
