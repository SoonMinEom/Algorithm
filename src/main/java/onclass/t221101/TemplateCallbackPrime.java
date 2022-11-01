package onclass.t221101;

interface StatementStrategy {
    boolean compare (int a, int b);
}


public class TemplateCallbackPrime {

    public boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num) ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();

        if(tcp.isPrime(97) ){
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
