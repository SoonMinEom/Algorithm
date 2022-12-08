package onclass2.t221208;

public class DynamicFibonacci {
    public static int fibonacci(int target){
        int[] memo = new int[target+1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i <memo.length ; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[target-1];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(29));
    }
}
