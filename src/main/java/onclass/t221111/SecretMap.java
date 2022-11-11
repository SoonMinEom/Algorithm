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

//        String[] sArr1 = new String[n];
//        String[] sArr2 = new String[n];

//        for (int i = 0; i < n ; i++) {
//                String binStr1 = Integer.toBinaryString(arr1[i]);
//                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
//
//                String binStr2 = Integer.toBinaryString(arr2[i]);
//                sArr2[i] = "0".repeat(n - binStr2.length()) + binStr2;
//        }

//        for (int i = 0; i < n ; i++) {
//            String binStr1 = Integer.toBinaryString(arr1[i]);
//            for (int j = 0; j < n- binStr1.length(); j++) {
//                binStr1 = 0 + binStr1;
//            }
//            sArr1[i] = binStr1;
//
//            String binStr2 = Integer.toBinaryString(arr2[i]);
//            for (int j = 0; j < n- binStr2.length(); j++) {
//                binStr2 = 0 + binStr2;
//            }
//            sArr2[i] = binStr2;
//        }
//
//        System.out.println(Arrays.toString(sArr1));
//        System.out.println(Arrays.toString(sArr2));

        String[] answer = new String[n];
        for (int i = 0; i < n ; i++) {
            answer[i] =Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n ; i++) {
            answer[i] = answer[i].replace("1","#").replace("0"," ");
            answer[i] = " ".repeat(n-answer[i].length()) + answer[i];
        }

//        System.out.println(Arrays.toString(answer));

        return answer;

    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        SecretMap sm = new SecretMap();
        sm.solution(n, arr1, arr2);


    }
}
