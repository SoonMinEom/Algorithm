package onclass.t221109;

import java.util.Arrays;

public class SelectionSort2 {
    private Compare cp;

    public SelectionSort2(Compare cp) {
        this.cp = cp;
    }

    public void selectionSort() {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length; i++) {
            int targetIdx = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if(cp.compare(arr[targetIdx],  arr[j])) {
                    targetIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[targetIdx];
            arr[targetIdx] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        // 인터페이스 구현체를 교체
        SelectionSort2 ss = new SelectionSort2(new Asc());
        ss.selectionSort();

        SelectionSort2 ss2 = new SelectionSort2(new Decs());
        ss2.selectionSort();

        // 익명 구현 클래스 활용
        SelectionSort2 ss3 = new SelectionSort2(new Compare() {
            @Override
            public boolean compare(int a, int b) {
                return a > b;
            }
        });
        ss3.selectionSort();

        // 람다식 활용 (구현 메소드가 하나인 인터페이스만 사용 가능)
        SelectionSort2 ss4 = new SelectionSort2((a,b) -> {
            return a < b;
        });
        ss4.selectionSort();

        // 더욱 간단한 람다식.
        SelectionSort2 ss5 = new SelectionSort2((a,b) -> a > b);
        ss5.selectionSort();
    }
}
