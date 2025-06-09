package array.sumfirstandlastsamenumber;

import java.util.HashMap;
import java.util.Map;

public class SumFirstAndLastSameNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {121, 222, 3011, 191, 544})); // 121 + 191
        System.out.println(solution(new int[] {12, 22022, 1111, 10232})); // 12 + 10232
        System.out.println(solution(new int[] {321, 222, 3011, 103, 52244, 202})); // 222 + 202
    }

    public static int solution(int[] arrays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrays.length; i++) {
            // get number at I
            String number = String.valueOf(arrays[i]);
            // split number to character
            char[] charArray = number.toCharArray();
            //get first, last character
            String first = String.valueOf(charArray[0]);
            String last = String.valueOf(charArray[charArray.length-1]);

            if (map.containsKey(first + last)) {
                return map.get(first + last) + Integer.parseInt(number);
            }
            map.put(first + last, arrays[i]);
        }
        return 0;
    }

}
