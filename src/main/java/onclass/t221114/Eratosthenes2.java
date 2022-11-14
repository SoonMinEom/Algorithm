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

        // 2를 제외한 2의 배수 자리에 0 넣기
        for (int i = 2; i < arr.length ; i+=2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));



    }


    public static void main(String[] args) {
        Eratosthenes2 e = new Eratosthenes2();
        e.solution(50);
    }
}
