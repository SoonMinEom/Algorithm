package pccp.p221123;



public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answerMap = new String[n];

        for (int i = 0; i < n; i++) {
            String temp=Integer.toBinaryString(arr1[i] | arr2[i]);
            String temp2 = " ".repeat(n-temp.length())+temp;
            String answer = temp2.replace("1","#").replace("0"," ");
            answerMap[i] = answer;
        }

        return answerMap;
    }

    public static void main(String[] args) {
        SecretMap secretMap  = new SecretMap();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        secretMap.solution(5, arr1, arr2);

    }
}
