import java.util.regex.Pattern;

public class OnlyDigits {
    public static void main(String[] args) {
        System.out.println(digitsOnly("0123456789"));
        System.out.println(digitsOnly("012345678a"));
    }

    public static boolean digitsOnly(String num) {
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        // need to flip boolean returned
        return !pattern.matcher(num).matches();
    }
}
