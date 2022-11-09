package onclass.t221109;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FunctionExample {

    // BiFunction 사용 시 ,인터페이스를 따로 선언해 줄 필요가 없음.
    // BiFunction< a, b, R> = a, b타입을 매개변수로 받고 R 타입을 리턴
    public void selectionSort(BiFunction<Integer, Integer, Boolean> biFunction) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length; i++) {
            int targetIdx = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if(biFunction.apply(arr[targetIdx],  arr[j])) {
                    targetIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[targetIdx];
            arr[targetIdx] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    // BiPredicate 는 BiFunction과 기능이 유사함
    // BiPredicate<a,b> = a,b 타입을 받아 boolean을 리턴
    // 즉, BiPredicate는 리턴타입이 boolean으로 고정되어 있음.
    public void selectionSort2(BiPredicate<Integer, Integer> biPredicate) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length; i++) {
            int targetIdx = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if(biPredicate.test(arr[targetIdx],  arr[j])) {
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

        // 기본적인 Fucntion 사용법
        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));

        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
        System.out.println(biFunction.apply(10, 20));

        FunctionExample fe = new FunctionExample();
        // BiFunction을 매개변수로 받으므로, 바로 람다식 적용
        fe.selectionSort((a,b)->a>b);
        fe.selectionSort((a,b)->a<b);

        // BiPredicate을 매개변수로 받으므로, 바로 람다식 적용
        fe.selectionSort2((a,b)->a>b);

    }
}
