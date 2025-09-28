package streams;

import java.util.stream.Collectors;

public class RemoveDuplicateCharsFromString {
    public static void main(String[] args) {
        way1();
        way2();

    }

    private static void way2() {

        // remove duplicate characters from String

        String str = "programming";

        // output should be - progamin

        String outputString = str.chars().distinct().mapToObj(Character::toString).collect(Collectors.joining());

        System.out.println(outputString);
    }

    public static void way1() {
        // remove duplicate characters from String

        String str = "programming";

        // output should be - progamin

        String outputString = str.chars().distinct().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());

        System.out.println(outputString);
    }

}
