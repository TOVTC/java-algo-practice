public class CountVowelConsonant {
    public static void main(String[] args) {
        System.out.println(checkVowel("hello"));
        System.out.println(checkVowel("Aries Of Wunderworld"));
    }

    public static int checkVowel (String phrase) {
        String lowercase = phrase.toLowerCase();
        char[] charArr = lowercase.toCharArray();
        int vowelCount = 0;

        for (char i : charArr) {
            switch (i) {
                case 'a':
                    vowelCount++;
                    break;
                case 'e':
                    vowelCount++;
                    break;
                case 'i':
                    vowelCount++;
                    break;
                case 'o':
                    vowelCount++;
                    break;
                case 'u':
                    vowelCount++;
                    break;
                default:
                    break;
            }
        }

        return vowelCount;
    }
}
