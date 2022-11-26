package pccp.p221126;

import java.util.Arrays;

public class JadenCase {
    public String solution(String s) {
        s = s.toLowerCase();

//        System.out.println(s);

        String[] split = s.split(" ");

//        System.out.println(Arrays.toString(split));

        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("")) continue;
            if (split[i].charAt(0)>96 && split[i].charAt(0)<123) {
                char first = split[i].charAt(0);
                first -= 32;
                split[i] = split[i].replaceFirst(split[i].charAt(0)+"",first+"");
            }
        }


//        System.out.println(Arrays.toString(split));

        String answer = split[0];
        for (int i = 1; i < split.length; i++) {
            answer += " "+split[i];
        }
        answer+=" ".repeat(s.length()-answer.length());

//        System.out.println(answer);
//        System.out.printf("old : %d, new : %d",s.length(), answer.length());



        return answer;
    }

    public static void main(String[] args) {
        JadenCase jc = new JadenCase();
        jc.solution("3people a Aa Aaa Bbb unFollouWEd me");
    }
}
