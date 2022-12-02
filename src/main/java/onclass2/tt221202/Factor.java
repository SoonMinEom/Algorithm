package onclass2.tt221202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factor {
    public static int solution(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if(num % i == 0){
                System.out.print(i + " ");
                factors.add(i);
                num /= i;
                i = 1;
            }
        }
        return factors.get(factors.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt());
    }
}
