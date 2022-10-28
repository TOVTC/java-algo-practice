public class CheckIfPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("hello"));
        System.out.println(checkPalindrome("racecar"));
    }

    public static boolean checkPalindrome(String word) {
        String reversed = reverse(word);
        if (word.equals(reversed)) {
            return true;
        }
        return false;
    }

    public static String reverse(String input) {
        if(input == null || input.isEmpty()) {
            return input;
        }
        // ending index for substring method is exclusive, input index is inclusive
        return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
    }
}
