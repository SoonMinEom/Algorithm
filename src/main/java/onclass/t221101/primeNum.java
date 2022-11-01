package onclass.t221101;

public class primeNum {
    public boolean solution(int num) {
        boolean result = true;

        for (int i = 2; i < num; i++) {
            if (num%i != 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        primeNum pn = new primeNum();
        System.out.println(pn.solution(17));
    }
}
