package onclass.t221101;

public class primeNum {

    public boolean isPrime(int num, int type) {
        boolean result = true;

        for (int i = 2; i < range(num,type); i++) {
            if (num%i != 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public double range(int num, int type ) {
        switch (type) {
            case 1 :
                return num;
            case 2:
                return num/2;
            case 3:
                return Math.sqrt(num)+1;
            default:
                return num;
        }
    }

//    public boolean isPrime2(int num) {
//        boolean result = true;
//
//        for (int i = 2; i < (num/2) ; i++) {
//            if (num%i != 0) {
//                result = true;
//            } else {
//                result = false;
//                break;
//            }
//        }
//        return result;
//    }

//    public boolean isPrime3(int num) {
//        boolean result = true;
//
//        for (int i = 2; i <= Math.sqrt(num) ; i++) {
//            if (num%i != 0) {
//                result = true;
//            } else {
//                result = false;
//                break;
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        primeNum pn = new primeNum();

        if(pn.isPrime(97,2) ){
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
