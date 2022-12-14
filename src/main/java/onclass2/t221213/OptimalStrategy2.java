package onclass2.t221213;

import java.util.Arrays;

class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
}

public class OptimalStrategy2 {
    public static void main(String[] args) {
        int[] arr = {2,7,40,19};
        Pair[][] dp = new Pair[4][4];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == j) dp[i][j] = new Pair(arr[i],0);
                else if(i+1 == j) {
                    if (arr[i] >= arr[j]) dp[i][j] = new Pair(arr[i],arr[j]);
                    else dp[i][j] = new Pair(arr[j],arr[i]);
                }
                else dp[i][j] = new Pair(0,0);
            }
        }

        for (Pair[] pairs : dp) {
            for (Pair pair : pairs) {
                System.out.printf("(%d, %d)  ",pair.left,pair.right );
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        // 첫째 줄 dp 해보기

        int[] arr2 = {2,7,40,19};
        int[][] dp2 = new int[4][4];
        int k = 0; //첫째 줄 고정
        for (int i = 0; i < dp2.length; i++) {
            if (i == 0) dp2[k][i] = arr2[i];
            else dp2[k][i] = dp2[k][i-1] + arr2[i];
        }

        System.out.println(Arrays.toString(dp2[k]));




    }
}
