package reversestring;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solution("Hello world"));
        System.out.println(reverse("Hello world"));
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length(); i > 0; i--) {
            sb.append(input.charAt(i-1));
        }
        return sb.toString();
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
