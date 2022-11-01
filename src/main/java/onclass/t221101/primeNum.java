package onclass.t221101;

public class primeNum {
    public boolean isPrime(int num) {
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

    public boolean isPrime2(int num) {
        boolean result = true;

        for (int i = 2; i < (num/2) ; i++) {
            if (num%i != 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean isPrime3(int num) {
        boolean result = true;

        for (int i = 2; i <= Math.sqrt(num) ; i++) {
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

        if(pn.isPrime3(91)) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
