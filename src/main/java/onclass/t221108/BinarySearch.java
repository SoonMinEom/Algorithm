package onclass.t221108;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[sc.nextInt()];

        int target = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int startIdx = 0;
        int endIdx = nums.length-1;
        int midIdx = (endIdx+1-startIdx)/2;

        int answer = 0;
//        1 2 3 4 5 6 7 8 9 10 11

        while (nums[midIdx] == target) {
            if(nums[midIdx] < target) {
                startIdx = midIdx +1;
            } else if (nums[midIdx] > target) {
                endIdx = midIdx -1;
            }
        }
            answer = midIdx+2;

        System.out.println(answer);


    }
}
