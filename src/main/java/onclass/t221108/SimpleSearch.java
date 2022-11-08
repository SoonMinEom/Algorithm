package onclass.t221108;

import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int targetIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                targetIdx = i +1;
            }
        }

        System.out.println(targetIdx);

    }
}
