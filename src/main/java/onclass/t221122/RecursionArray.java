package onclass.t221122;

public class RecursionArray {
    public static int arrayPlus(int[] arr, int pointer) {
        if (pointer >= arr.length) {
            return 0;
        }

        int p = pointer;
        int n = 0;
        n += arr[p++];
        n += arrayPlus(arr, p);

        return n;
    }

    public static int arrayPlus2(int[] arr, int pointer) {
        if (pointer >= arr.length) {
            return 0;
        }
        return arr[pointer++] + arrayPlus2(arr,pointer);
    }
    public static void main(String[] args) {
        int[] arr = {7, 3 , 2 , 9};

        System.out.println(arrayPlus2(arr, 0));
    }
}
