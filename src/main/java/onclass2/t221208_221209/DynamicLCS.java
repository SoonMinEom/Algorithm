package onclass2.t221208_221209;

public class DynamicLCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; // 열
        String str2 = "DCABDC"; // 행

        int[][] arr = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("%s %s\n",str2.charAt(i), str1.charAt(j));
            }
        }
    }
}
