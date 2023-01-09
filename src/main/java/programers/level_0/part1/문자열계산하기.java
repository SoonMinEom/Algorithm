package programers.level_0.part1;
import java.util.Stack;

public class 문자열계산하기 {

    public int solution(String my_string) {
        String[] array = my_string.split(" ");
        Stack<String> st = new Stack<>();
        for (int i = array.length-1 ; i >=0 ; i--) {
            st.add(array[i]);
        }
        int result = 0;
        while (st.size()>=3) {
            result = calc(Integer.valueOf(st.pop()), st.pop(), Integer.valueOf(st.pop()));
            st.add(String.valueOf(result));
        }
        return result;
    }
    public static int calc(int a, String b, int c) {
        if (b.equals("+")) return a+c;
        else return a-c;
    }

}
