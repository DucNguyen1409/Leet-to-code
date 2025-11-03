package reversecharacter;

import java.util.Arrays;

public class ReverseCharacter {
    public static void main(String[] args) {
        char[] input = {'h','e','l','l','o'};
        ReverseString(input);
    }


    public static void ReverseString(char[] s) {
        System.out.println(s.length);
        StringBuilder sb = new StringBuilder();
        for (int i = s.length; i > 0; i--) {
            sb.append(s[i-1]);
        }
        System.out.println(Arrays.toString(sb.toString().toCharArray()));
    }
}
