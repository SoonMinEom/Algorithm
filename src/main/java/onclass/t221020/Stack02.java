package onclass.t221020;

import java.util.EmptyStackException;

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

        if(this.isEmpty()) {
            throw new RuntimeException("Stack Is Empty!");
        }

        this.pointer--;
        int popped = this.arr[this.pointer];

        return popped;
    }

    public boolean isEmpty() {
        if (this.pointer ==0) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[pointer-1];
    }
}
