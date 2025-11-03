package functionalinterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class functional {

    // code truyền thống
    public static String transform(String input) {
        return input.toUpperCase();
    }
    public interface StringTransform {
        String transform(String input);
    }


    // lập trình hướng hàm
    public static String transform(String input, StringTransform stringTransform) {
        return stringTransform.transform(input);
    }

    // sử dụng functional interface
    public static String transformInterface(String input, StringTranformInterface stringTranformInterface) {
        return stringTranformInterface.transform(input);
    }

    public static void main(String[] args) {
        System.out.println(transform("duc"));

        // lambda expression
        System.out.println(transform("nguyenduc", input -> input.toUpperCase()));
        // method reference
        System.out.println(transform("nguyenDuc", String::toLowerCase));

        List<List<String>> list = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
        System.out.println(list);

        System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));
    }

}
