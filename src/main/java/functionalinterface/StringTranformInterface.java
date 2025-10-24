package functionalinterface;

@FunctionalInterface
public interface StringTranformInterface {
    String transform(String input); // functional interface thì chỉ có duy nhất 1 func

    // hàm default
    default void printf(String input) {
        System.out.println(input);
    }

    // hàm static gọi từ class được
    static String concat(String a, String b) {
        return a.concat(b);
    }
}
