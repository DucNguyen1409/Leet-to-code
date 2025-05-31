package array.bubblesort;

public class BubbleSortMain {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {25, 30, 28, 22, 35, 29, 31, 27}).toString());
    }

    public static int[] solution(int[] numsOriginal) {
        int[] nums = numsOriginal;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
