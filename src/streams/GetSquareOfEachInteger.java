package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetSquareOfEachInteger {


    public static void main(String[] args) {
        way1();
        way2();

    }

    public static void way1() {
        List<Integer> list = Arrays.asList(1, 8, 2, 4, 5, 5, 6);

        List<Integer> outputList = list.stream().
                map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(outputList);
    }

    public static void way2() {
        List<Integer> list = Arrays.asList(1, 8, 2, 4, 5, 5, 6);

        list.stream().
                map(n -> n * n)
                .forEach(System.out::print);
    }

}
