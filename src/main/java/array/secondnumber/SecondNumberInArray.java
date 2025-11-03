package array.secondnumber;

public class SecondNumberInArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 2, 3, 4, 4, 5}));
    }

    public static int solution(int[] input) {
        Integer first = null;
        Integer second = null;
        for (int i = 0; i < input.length; i++) {
            if (first == null || input[i] > first) {
                second = first;
                first = input[i];
            }
            if ((second == null || input[i] > second) && input[i] != first) {
                second = input[i];
            }
        }

        return second;
    }
}
