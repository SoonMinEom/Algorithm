package programers.level_0.part2;

// https://school.programmers.co.kr/learn/courses/30/lessons/120888

public class 중복된문자제거 {
    public static String solution(String my_string) {
        // 방법 1
//        char[] chars = my_string.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = i+1; j < chars.length; j++) {
//                if (chars[i] == chars[j]) chars[j] = 0;
//            }
//        }
//
//        String answer ="";
//        for (char aChar : chars) {
//            if (aChar != 0) answer+= aChar;
//        }
//        return answer;

        //방법 2
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(String.valueOf(my_string.charAt(i))) == i) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String a = "people";
        System.out.println(중복된문자제거.solution(a));
    }
}
