package onclass2.t221123;

import java.util.ArrayList;
import java.util.List;

public class Pibonacci {
    public int fib(int n) {
        if(n==1 || n==2) return 1;

        List<Integer> fibNum = new ArrayList<>();
        fibNum.add(1);
        fibNum.add(1);

        for (int i = 2; i < n ; i++) {
            fibNum.add(fibNum.get(i-1)+fibNum.get(i-2));
        }

        return fibNum.get(n-1);
    }
}
