package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUppercase {

    public static void main(String[] args) {
        String[] input = {"hello", "world"};

        List<String> list = Arrays.stream(input).map(String::toUpperCase).toList();


        String[] output = list.toArray(new String[0]);

        for (String s : output) {
            System.out.print(s);
        }
    }
}
