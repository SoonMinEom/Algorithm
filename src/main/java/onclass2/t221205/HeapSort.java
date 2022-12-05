package onclass2.t221205;

public class HeapSort {
    public static void childIdx(int num) {
        System.out.printf("leftIdx : %d\n", 2*num+1);
        System.out.printf("rightIdx : %d", 2*num+2);
    }
    public static void sort(int[] nums){

    }

    public static void main(String[] args) {
        int[] arr = {6,5,7,8};
        sort(arr);
        childIdx(3);
    }
}
