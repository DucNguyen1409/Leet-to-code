package array.findthemaxage;

public class FindTheMaxAgeMain {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {25, 30, 28, 22, 35, 29, 31, 27})); // 35
    }

    public static int solution(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
