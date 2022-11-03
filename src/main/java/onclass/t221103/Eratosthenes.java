package onclass.t221103;

public class Eratosthenes {

    public int checkPrime(int n) {
        int cnt = 0;
        int[] prime = new int[n+1];

        for (int i = 0; i < prime.length; i++) {
            prime[i] = i;
        }

        for (int i = 0; i*i <n ; i++) {
            if(prime[i] == 0) {
                continue;
            }
            for (int j = i*i; j <n ; j++) {
                prime[j]=0;
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if (prime[i] != 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
