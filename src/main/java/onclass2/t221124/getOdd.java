package onclass2.t221124;

import java.util.Scanner;

public class getOdd {
    public static void solution(int a, int b) {
        if (a>b)return;
        if (a==b) {
            if (a%2 ==0) {
                return;
            } else {
                System.out.print(a+"");
                return;
            }
        }
        if (a%2 == 0) {
            a++;
        }
        System.out.print(a+" ");
        solution(a+2, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt(), sc.nextInt());
    }
}
