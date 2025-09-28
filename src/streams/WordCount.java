package streams;

import java.util.Arrays;

public class WordCount {


    public static void main(String[] args) {
        // count number of words in String

        String inputStr = "Hello this is Java application";
        String trimmedString = inputStr.trim();
        Long count = Arrays.stream(trimmedString.split(" ")).filter(word -> !word.isEmpty()).count();
        System.out.println(count);

    }
}
