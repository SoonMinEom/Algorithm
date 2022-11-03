package onclass.t221103;

public class Eratosthenes {

    public void leve1() {
        for (int i = 0; i <99 ; i++) {
            System.out.printf("%d, %d\n", (i+2), (i+1)*2);
        }
    }

    public static void main(String[] args) {
        Eratosthenes er = new Eratosthenes();
        er.leve1();
    }
}
