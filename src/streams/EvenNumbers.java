package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 60};
        System.out.println(getEvens(arr));
    }

    private static List<Integer> getEvens(int[] arr) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        return numbers.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
