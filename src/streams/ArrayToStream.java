package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayToStream {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        // Convert array to stream
        Stream<String> stream = Arrays.stream(arr);
        List<String> list = stream.toList();
        System.out.println(list);
    }
}