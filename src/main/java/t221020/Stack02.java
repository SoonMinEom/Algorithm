package t221020;

public class Stack02 {

    private Integer[] arr;

    private int pointer = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        this.arr[pointer] = value;
        this.pointer++;
    }

    public Integer[] getArr() {
        return arr;
    }

    public int pop() {
        this.pointer--;
        int popped = this.arr[this.pointer];

        return popped;
    }
}
