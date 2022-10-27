public class CountCharInString {
    public static void main(String[] args) {
        System.out.println(countChar("today is a good day", 'a'));
    }

    public static int countChar(String phrase, char ch) {
        int count = 0;
        for (char i : phrase.toCharArray()) {
            if (i == ch) {
                count++;
            }
        }
        return count;
    }
}
