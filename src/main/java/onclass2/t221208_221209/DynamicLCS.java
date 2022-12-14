package onclass2.t221208_221209;

import java.util.Arrays;

public class DynamicLCS {
    public static int max(int a, int b) {
        if (a>b) return a;
        else return b;
    }

    public static void main(String[] args) {
        String str1 = "ABCDCBA"; // 열
        String str2 = "DCABDC"; // 행

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
//                System.out.printf("%s %s\n",str2.charAt(i), str1.charAt(j));
                // 두 개가 같으면 대각선에서 가지고오기
                if (str2.charAt(i-1) == str1.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                // 두 개가 다르면 왼쪽, 위쪽 중 큰 값을 가져오기
                else dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
            }
        }

//        System.out.println(Arrays.toString(dp));
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
