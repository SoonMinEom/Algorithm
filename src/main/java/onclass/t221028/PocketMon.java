package onclass.t221028;

import java.util.HashSet;
import java.util.Set;

public class PocketMon {

    public int solution(int[] nums) {

        Set<Integer> po = new HashSet<>();

        for (int num : nums) {
            po.add(num);
        }

        if (po.size() > nums.length/2) {
            return nums.length/2;
        } else {
            return po.size();
        }


//        맞다고 나오긴 하는데...

//        Map<Integer, Integer> po = new HashMap<>();
//
//        for (int num : nums) {
//            po.put(num, 1);
//        }
//
//        Iterator<Integer> iterMap = po.keySet().iterator();
//
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < nums.length/2 ; i++) {
//            if ( iterMap.hasNext()) {
//                result.add(iterMap.next());
//            } else {
//                break;
//            }
//        }
//        return result.size();
    }
}
