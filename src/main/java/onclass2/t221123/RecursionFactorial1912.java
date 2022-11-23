package onclass2.t221123;

import java.util.Scanner;

public class RecursionFactorial1912 {
    public static int factorial(int n) {
        if (n ==1) return 1;
        return n*factorial(--n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }
}
