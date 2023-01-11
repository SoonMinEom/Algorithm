package programers.level_0.part2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120887

public class k의개수 {
    public int solution(int i, int j, int k) {
        // 방법 1
//        int answer = 0;
//        for (int l = i; l <= j ; l++) {
//            String temp = String.valueOf(l);
//            for (int m = 0; m < temp.length(); m++) {
//                if (String.valueOf(temp.charAt(m)).equals(String.valueOf(k))) answer++;
//            }
//        }

        //방법2
//        String temp = "";
//        for (int l = i; l <= j; l++) {
//            temp += l+"";
//        }
//        return temp.length() - temp.replace(k+"","").length();

        // 방법3
        int answer = 0;

        for (int l = i; l <= j ; l++) {
            int temp = l;
            while (temp != 0) {
                if (temp % 10 == k) answer++;
                temp /= 10;
            }
        }

        return answer;
    }
}
