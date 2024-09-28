package array.findtheduplicatenumber;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1,3,4,2,2})); // 2
        System.out.println(findDuplicate(new int[] {3,1,3,4,2})); // 3
        System.out.println(findDuplicate(new int[] {3,3,3,3,3})); // 3
    }

    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }

        return 0;
    }
}
