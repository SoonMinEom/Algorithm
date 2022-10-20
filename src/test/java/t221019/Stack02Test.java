package t221019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import t221020.Stack02;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    // 각 테스트가 실행되기 전에 실행되는 구간
    // db에 데이터 넣는 테스트를 할 때, 이곳에 데이터 지우는 코드를 작성하는 등..
    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @Test
    void push() {
        Stack02 st = new Stack02();

        st.push(10);
        st.push(20);

        Integer[] arr = st.getArr();

        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {
        Stack02 st = new Stack02();

        st.push(10);
        st.push(20);

        assertEquals(20,st.pop());
        assertEquals(10,st.pop());
        // st.pop() 비어있을땐? -> isEmpty
    }
}