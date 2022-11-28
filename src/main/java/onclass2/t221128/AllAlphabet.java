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
    public void solution3(String prefix, char a) {
        if (a>90) {
            char temp = prefix.charAt(0);
            temp++;
            prefix = temp+"";
            a -= 26;
            if (temp > 90) return;
        }
        System.out.printf("%s%s\n",prefix,a++);
        solution3(prefix,a);
    }
    public void solution4(String prefix,int length) {
        if (prefix.length() > length) {
            System.out.println(prefix);
            return;
        }
        for (char c = 'A' ; c <= 'Z' ; c++) {
            solution4(prefix+c,length);
        }
    }
    public static void main(String[] args) {
        AllAlphabet aa = new AllAlphabet();
        aa.solution4("",1);
    }
}
