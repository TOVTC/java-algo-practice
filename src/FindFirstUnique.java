import java.util.*;

public class FindFirstUnique {
    public static void main(String[] args) {
        System.out.println(firstUnique("Eevee"));
        System.out.println(test("Eevee"));
    }

    // method 1
    public static char firstUnique(String word) {
        String lowercase = word.toLowerCase();
        Set<Character> repeating = new HashSet<Character>();
        List<Character> nonrepeating = new ArrayList<Character>();

        for (int i = 0; i < lowercase.length(); i++) {
            char letter = lowercase.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonrepeating.contains(letter)) {
                // why (Character) syntax here?
                nonrepeating.remove((Character) letter);
            } else {
                nonrepeating.add(lowercase.charAt(i));
            }
        }

        return nonrepeating.get(0);
    }

    // method 2
    public static char test(String word) {
        String lowercase = word.toLowerCase();
        char[] wordArr = lowercase.toCharArray();
        HashMap<Character, Integer> tracker = new HashMap<Character, Integer>();
        for (char i : wordArr) {
            if (tracker.containsKey(i)) {
                tracker.put(i, tracker.get(i) + 1);
            } else {
                tracker.put(i, 1);
            }
        }

        for (int i = 0; i < lowercase.length(); i++) {
            char letter = lowercase.charAt(i);
            if (tracker.get(letter) == 1) {
                return letter;
            }
        }
        throw new RuntimeException("No unique characters");
    }

}
