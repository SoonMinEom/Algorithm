package homework.h221020;

public class Main {

    public long solution (int a, int b) {
        long answer = 0;
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        for (int i = a; i <= b ; i++) {
            answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.solution(3,5));

    }
}
