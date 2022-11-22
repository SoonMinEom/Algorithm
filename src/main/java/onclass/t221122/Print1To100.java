package onclass.t221122;

public class Print1To100 {
    public static void print1To100(int n) {
        // 탈출 조건
        if(n>100) {
            return;
        }

        // 원하는 로직
        System.out.println(n);

        // 탈출 조건을 만족시키기 위한 로직
        n++;

        // 재귀
        print1To100(n);
    }
    public static void main(String[] args) {
        print1To100(1);
    }
}
