package onclass2.t221212;

import java.util.Arrays;

public class DynamicMCP {
    public static int mcp(int[][] arr) {
        // 0 으로 초기화 된 3x3 배열 선언
        int[][] dp = new int[arr.length][arr[0].length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if ( i == 0 && j == 0) dp[i][j] = arr[i][j];
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
