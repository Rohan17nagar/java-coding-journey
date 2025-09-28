package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStringsByPrefix {
    public static void main(String[] args) {
        way1();
        way2();

    }

    private static void way2() {
        String[] arr = {"apple", "banana", "ant", "    abbb"};
        String prefix = "a";

        List<String> outputArr = Stream.of(arr).

                map(String::trim).
                filter(trim -> trim.startsWith(prefix)).
                collect(Collectors.toList());


        System.out.println(outputArr);

    }

    private static void way1() {


        String[] arr = {"apple", "banana", "ant", "    abbb"};
        String prefix = "a";

        List<String> outputArr = Stream.of(arr).
                map(String::trim).
                filter(i -> i.startsWith(prefix)).
                collect(Collectors.toList());


        System.out.println(outputArr);

    }
}
