package onclass.t221101;


public class TemplateCallbackPrime {
    boolean range(int a, int b) {
        return a <b;
    }

    public boolean isPrime(int num) {
        for (int i = 2; range(i, num) ; i++) {
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
