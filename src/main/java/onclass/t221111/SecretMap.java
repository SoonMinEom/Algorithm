package onclass.t221111;

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

        // 2진수 리턴 메소드를 직접 만들어봐요



//        String[] strArr1 = new String[n];
//        for (int i : arr1) {
//            Integer.toBinaryString(i);
//        }
//
//        String[] strArr2 = new String[n];
//        for (int i : arr2) {
//            Integer.toBinaryString(i);
//        }
//
//        for (int i = 0; i < ; i++) {
//
//        }
//
//        if(strArr1[1].charAt(0) != strArr2[1].charAt(0)) {
//            strArr1[1].charAt(0) = '0';
//            strArr2[1] = "0";
//        }

        String result = "";
        while (arr1[1] > 0) {
            result += (arr1[1] % 2);
            arr1[1] = arr1[1] /2;
        }


        String[] answer = {};
        return answer;

    }

    public static void main(String[] args) {

        SecretMap sm = new SecretMap();
        System.out.println(sm.toBinary(30));
    }
}
