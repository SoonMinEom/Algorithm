package onclass2.t221123;

import java.util.Scanner;

public class RecursionPibonacci {
    public static int pibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return pibonacci(n-1)+pibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pibonacci(n));
    }
}
