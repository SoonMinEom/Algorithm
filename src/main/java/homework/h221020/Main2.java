package homework.h221020;

public class Main2 {

    public String solution (int n) {
        String answer = "";

        for (int i = 1; i <=n ; i++) {
            if ( i%2 != 0) {
                answer +="수";
            } else {
                answer +="박";
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Main2 main = new Main2();
        System.out.println(main.solution(3));

    }
}
