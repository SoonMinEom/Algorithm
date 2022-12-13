package onclass2.t221213;

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
                else dp[i][j] = new Pair(0,0);
            }
        }

        for (Pair[] pairs : dp) {
            for (Pair pair : pairs) {
                System.out.printf("(%d, %d)  ",pair.left,pair.right );
            }
            System.out.println();
        }
    }
}
