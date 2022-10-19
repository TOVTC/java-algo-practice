import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println(anagramCheck("star", "RaTs"));
        System.out.println(anagramCheck("seldOm", "models"));
        System.out.println(anagramCheck("parallel", "height"));
    }

    public static boolean anagramCheck(String first, String second) {
        String fw = first.toLowerCase();
        String sw = second.toLowerCase();

        if (fw.length() != sw.length()) {
            return false;
        }

        char[] fwArr = fw.toCharArray();
        char[] swArr = sw.toCharArray();

        Arrays.sort(fwArr);
        Arrays.sort(swArr);

        for (int i = 0; i < fwArr.length; i++) {
            if (fwArr[i] != swArr[i]) {
                return false;
            }
        }

        return true;
    }
}
