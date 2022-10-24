package onclass.t221024;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNum {

    int[] arr;

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

    public int getKthNum ( int[] command ) {
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];

        int result = 0 ;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1 ; i <toIdx; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0 ; i < nth ; i ++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution2(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
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
        int[] result = kthNum.solution2(arr,commands);

        System.out.println(Arrays.toString(result));

    }
}
