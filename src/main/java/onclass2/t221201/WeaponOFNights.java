package onclass2.t221201;

public class WeaponOFNights {
    public static int solution(int number,int limit, int power) {
        int[] weapon = new int[number];

        for (int i = 0; i < number; i++) {
            weapon[i] += i+1;
        }

        int answer = 0;

        for (int i = 0; i < weapon.length; i++) {
            int cnt = 0;
            for (int j = 1; j*j<=weapon[i]; j++) {
                if (weapon[i]%j ==0) {
                    if (weapon[i]/j == j) cnt++;
                    else cnt +=2;
                }
            }
            if (cnt > limit) cnt = power;
            System.out.println(cnt);
            answer += cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(5,1,1);
    }
}
