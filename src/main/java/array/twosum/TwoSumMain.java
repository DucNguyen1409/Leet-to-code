package array.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // target - số[i] = số cần tìm còn lại
            int minus = target - nums[i];

            // nếu map chứa số cần tìm còn lại thì return vị trí 2 số tìm được
            if (map.containsKey(minus)) {
                return new int[] {i, map.get(minus)};
            }

            // Map (số, vị trí) => Map ko tìm get được value chỉ get value từ index
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
