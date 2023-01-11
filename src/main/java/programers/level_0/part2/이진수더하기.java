package programers.level_0.part2;

public class 이진수더하기 {
    public static String solution(String bin1, String bin2) {
        int a = getNum(bin1);
        int b = getNum(bin2);

        return Integer.toBinaryString(a+b);
    }

    public static int getNum(String str) {
        int mul = 1;
        int binary = 0;

        for (int i = str.length() - 1; i >= 0 ; i--) {
            if ((str.charAt(i)+"").equals("1")){
                binary += mul;
            }
            mul *=2;
        }
        return binary;
    }

    //방법2
    public String solution2(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        System.out.println(이진수더하기.solution("10", "11"));
        System.out.println(2&3);
    }

}
