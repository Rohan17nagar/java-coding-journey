package streams;

import utility.SumClass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharacter {

    public static void main(String[] args) {

        String string = "Iam very very very good good and good good person";

        /*
         * Map the char count
         * Condition:
         * 1. It should not show the space counts
         * 2. No character should be repeated as a key
         * 3. Characters should appear in sequential order.
         * */
        Map<Character, Integer> countChars = string.chars().
                mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.toMap(
                        c -> c,
                        c -> 1,
                        SumClass::sum,
                        LinkedHashMap::new
                ));
        System.out.println(countChars);
    }

}
