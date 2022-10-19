public class RecursionStringReversal {
    public static void main(String[] args) {
        System.out.println(reverseRecursively("word"));
    }

//    public static String reversal(String word) {
//        int val = 1;
        // if word.length() == 1 return word
        // newword = word - last letter
        // return letter + reversal(word.deleteCharAt(word.length() - 1);
        // return word.charAt(word.length() - val)
//    }
    public static String reverseRecursively(String str) {

        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
