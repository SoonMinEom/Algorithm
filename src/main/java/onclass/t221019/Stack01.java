package onclass.t221019;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public int[] getArr() {
        return this.arr;
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer++;
    }

    public int pop() {

        this.pointer--;
        int popped = arr[this.pointer];

        return popped;
    }

    public int peek() {

        int peeked = arr[this.pointer-1];

        return peeked;
    }

    public boolean isEmpty() {
        if(this.pointer == 0 ) {
            return true;
        } else {
            return false;
        }
    }


}
