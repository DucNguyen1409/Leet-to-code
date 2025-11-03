package notduplicate;

import java.util.*;

public class NotDuplicateCharacter {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 2, 3, 4, 4, 5}));
    }
    public static List<Integer> solution(int[] input) {
        Map<Integer, Integer> result = new HashMap<>();
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (!result.containsKey(input[i])) {
                result.put(input[i], 1);
                number.add(input[i]);
            }
        }
        return number;
    }
}
