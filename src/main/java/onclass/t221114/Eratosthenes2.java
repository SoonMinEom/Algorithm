package onclass.t221114;

import java.util.Arrays;

// check 배열을 쓰는 대신 기존 배열의 합성수들을 0으로 바꾸기
public class Eratosthenes2 {

    public void solution(int length) {
        // 범위 입력 받기
        int[] arr = new int[length-1];

        // 2~입력범위 까지 숫자 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+2;
        }
        System.out.println(Arrays.toString(arr));

//        // 2를 제외한 2의 배수 자리에 0 넣기
//        for (int i = 2; i < arr.length ; i+=2) {
//            arr[i] = 0;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // 3를 제외한 3의 배수 자리에 0 넣기
//        for (int i = 4; i < arr.length ; i+=3) {
//            arr[i] = 0;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // 4를 제외한 4의 배수 자리에 0 넣기
//        for (int i = 6; i < arr.length ; i+=4) {
//            arr[i] = 0;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // 5를 제외한 5의 배수 자리에 0 넣기
//        for (int i = 8; i < arr.length ; i+=5) {
//            arr[i] = 0;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // 7를 제외한 7의 배수 자리에 0 넣기
//        for (int i = 12; i < arr.length ; i+=7) {
//            arr[i] = 0;
//        }
//        System.out.println(Arrays.toString(arr));

        // 위의 식을 for문으로 반복 처리
        for (int i = 2; i*i <= length ; i++) {
            for (int j = 2*(i-1); j < arr.length ; j +=i) {
                arr[j] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // 소수의 개수 출력
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);



    }


    public static void main(String[] args) {
        Eratosthenes2 e = new Eratosthenes2();
        e.solution(50);
    }
}
