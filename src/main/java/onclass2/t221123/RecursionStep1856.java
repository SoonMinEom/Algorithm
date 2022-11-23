package onclass2.t221123;

import java.util.Scanner;

public class RecursionStep1856 {
    public static int step(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        return step(n-1)+step(n-2)+step(n-3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(step(num));
    }
}
