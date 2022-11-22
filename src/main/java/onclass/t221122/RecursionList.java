package onclass.t221122;

import java.util.ArrayList;
import java.util.List;

public class RecursionList {
    public static int arrayPlus(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        int n = 0;
        n += list.get(0);
        list.remove(0);
        n += arrayPlus(list);

        return n;
    }

    public static int arrayPlus2(List<Integer> list) {
        if (list.isEmpty()) return 0;
        return list.remove(list.size()-1) + arrayPlus2(list);
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        System.out.println(arrayPlus2(nums));

    }
}
