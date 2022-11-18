package onclass.t221118;

public class Caesar {
    public String solution(String s, int n) {

        String answer = "";

        int[] chars = new int[s.length()];

        for (int i = 0; i < s.length() ; i++) {
            chars[i] = s.charAt(i);
        }

        // A~Z      65~90
        // a~z    97~122
        // 공백 32

        for (int aChar : chars) {
            if(aChar != 32) {

                if(aChar >=65 && aChar <=90) {
                    aChar += n;
                    if (aChar>90) {
                        aChar -= 26;
                    }
                }

                if(aChar >=97 && aChar <=122) {
                    aChar += n;
                    if (aChar>122) {
                        aChar -= 26;
                    }
                }
            }
            char temp = (char)aChar;
            answer += temp;
        }
        return answer;
    }

    public static void main(String[] args) {
//        int c = ' ';
//        System.out.println(c);

        Caesar main = new Caesar();
        System.out.println(main.solution("a B z",4));

    }
}
