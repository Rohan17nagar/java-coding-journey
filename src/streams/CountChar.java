package streams;

public class CountChar {
    public static void main(String[] args) {
        String inputStr = "hello world";

        char targetChar = ' ';

        long output = inputStr.chars().filter(
                i -> i == targetChar
        ).count();

        System.out.println("count of " + targetChar + " is " + output);
    }
}
