package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicatesFromStringArray {

    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c", "d", "a", "b", "c", "d"};

        // Convert array to stream
        Stream<String> stream = Arrays.stream(stringArray);

        // Remove duplicates using distinct() and collect to list
        List<String> distinctList = stream.distinct().toList();

        System.out.println(distinctList);

    }
}