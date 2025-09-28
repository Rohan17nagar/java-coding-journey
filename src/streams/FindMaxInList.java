package streams;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class FindMaxInList {



    public static void main(String[] args) {

        // Java program to get the max count char in the String using stream api

        String str = "aaaaaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzbbbbaa";

        Map<String, Long> map = str.chars()
                .mapToObj(a->(char)a)

                .filter(i->i!=' ')

                .collect(Collectors
                        .groupingBy(
                                Object::toString,
                                LinkedHashMap::new,
                                Collectors.counting()));


        String output = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();

        System.out.println(output);

    }
}
