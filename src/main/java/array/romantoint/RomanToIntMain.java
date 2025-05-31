package array.romantoint;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntMain {
    public static void main(String[] args) {
        System.out.println(romanToInt("III")); //III = 3
        System.out.println(romanToInt("LVIII")); //L = 50, V= 5, III = 3.
        System.out.println(romanToInt("MCMXCIV")); //M = 1000, CM = 900, XC = 90 and IV = 4
    }

    public static int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            // check 6 instances subtraction
            if (i++ < s.length()) {
                String string = String.valueOf(s.charAt(i + 1));
                if (string.equals("CM")
                        || string.equals("CD")
                        || string.equals("XC")
                        || string.equals("IV")) {
                    result += symbolToValueSpecial().get(String.valueOf(s.charAt(i)));
                    i++;
                }
            } else {
                result += symbolToValue().get(String.valueOf(s.charAt(i)));
            }
        }

        return result;
    }

    public static Map<String, Integer> symbolToValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        return map;
    }

    public static Map<String, Integer> symbolToValueSpecial() {
        Map<String, Integer> map = new HashMap<>();
        map.put("CM", 900);
        map.put("XC", 90);
        map.put("IV", 4);
        return map;
    }
}
