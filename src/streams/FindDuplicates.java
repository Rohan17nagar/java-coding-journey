package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args) {
        System.out.println(findDuplicates());
    }

    public static Set<Integer> findDuplicates() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 2, 4);
        return numbers.stream().
                collect(Collectors.groupingBy(n -> n, Collectors.counting())).
                entrySet().
                stream().
                filter(e -> e.getValue() > 1).
                map(Map.Entry::getKey).collect(Collectors.toSet());
    }

}
