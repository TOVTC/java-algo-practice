import java.util.HashMap;
import java.util.Map;

public class FindDupeChar {
    public static void main(String[] args) {
        printDupes("puptheband");
        printDupes("incorporated");
        printDupes("bankruptcy");
    }

    public static void printDupes(String word) {
        char[] characters = word.toCharArray();

        boolean duplicate = false;

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        for (Character i : charMap.keySet()) {
            if (charMap.get(i) > 1) {
                System.out.println(i);
                duplicate = true;
            }
        }

        if (duplicate == true) {
            System.out.println("All duplicates found for '" + word + "'");
        } else {
            System.out.println("No duplicates found for '" + word + "'");
        }

    }
}
