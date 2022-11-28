package onclass2.t221128;

import java.util.Arrays;

public class AllAlphabet {
    public void solution() {
        char[] alpha = new char[26];
        char[] beta =  new char[26];

        char start = 65;
        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = start++;
            beta[i] = alpha[i];
        }

        String answer = "";
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < beta.length; j++) {
                answer=(alpha[i]+"")+(beta[j]+"");
                System.out.println(answer);
            }
        }
    }
    public void solution2(char a) {
        if (a>90) return;
        System.out.println(a++);
        solution2(a);
    }

    public static void main(String[] args) {
        AllAlphabet aa = new AllAlphabet();
        aa.solution2('A');
    }
}
