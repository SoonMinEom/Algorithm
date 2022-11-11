package onclass.t221111;

import java.util.Arrays;

public class SecretMap {
    // 2 진수 리턴 메소드를 직접 만들어봐요
    public String toBinary(int num) {
        String first = "";
        while (num > 0) {
            first += (num % 2);
            num /= 2;
        }

        String result = "";
        for (int i = first.length()-1 ; i >=0 ; i--) {
            result += first.charAt(i);
        }

        return result;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];

        for (int i = 0; i < n ; i++) {
            //arr1
            for (int j = 0; j < n ; j++) {

                String binStr1 = Integer.toBinaryString(arr1[i]);
                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;

                String binStr2 = Integer.toBinaryString(arr2[i]);
                sArr2[i] = "0".repeat(n - binStr2.length()) + binStr2;
            }
        }

        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));


        String[] answer = {};
        return answer;

    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        SecretMap sm = new SecretMap();
//        System.out.println(sm.toBinary(30));
        sm.solution(n, arr1, arr2);
    }
}
