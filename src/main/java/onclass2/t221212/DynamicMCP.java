package onclass2.t221212;

import java.util.Arrays;

public class DynamicMCP {

    public static int min(int a, int b, int c) {
        return (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    }
    public static int mcp(int[][] arr) {
        // 0 으로 초기화 된 3x3 배열 선언
        int[][] dp = new int[arr.length][arr[0].length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                //(0,0) 채우기
                if ( i == 0 && j == 0) dp[i][j] = arr[i][j];
                //첫 행 나머지 채우기
                else if ( i == 0 && j != 0 ) dp[i][j] = dp[i][j-1] + arr[i][j];
                // 첫 열 나머지 채우기
                else if ( i != 0 && j == 0 ) dp[i][j] = dp[i-1][j] + arr[i][j];
                // 나머지 부분 채우기.
                else {
                    int a = dp[i-1][j] + arr[i][j];
                    int b = dp[i][j-1] + arr[i][j];
                    int c = dp[i-1][j-1] + arr[i][j];
                    dp[i][j] = min(a,b,c);
                }

            }
        }


        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,2},{4,6,2},{1,2,4}};
        mcp(arr);
    }
}
