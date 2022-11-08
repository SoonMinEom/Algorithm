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
        int midIdx = (endIdx+1+startIdx)/2;

        while (nums[midIdx] != target) {
//            System.out.printf("시작 : %d 끝 : %d\n",startIdx,endIdx);
            if (nums[midIdx] < target) {
                startIdx = midIdx + 1;
            } else if (nums[midIdx] > target) {
                endIdx = midIdx - 1;
            } else {
                System.out.println(midIdx);
            }
            midIdx = (endIdx+1+startIdx)/2;
        }
        System.out.println(midIdx+1);
    }
}
