package onclass.t221024;

import java.util.Arrays;

public class KthNum {

    public int[] solution ( int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int[] sliceArr = Arrays.copyOfRange(arr, command[0]-1, command[1]);
            Arrays.sort(sliceArr);
            answer[idx++] = sliceArr[command[2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        KthNum kthNum = new KthNum();
        int[] result = kthNum.solution(arr,commands);

        System.out.println(Arrays.toString(result));

    }
}
