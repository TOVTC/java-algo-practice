public class CheckIfRotation {
    public static void main(String[] args) {
        System.out.println(checkRotation("HelloNewFriend", "FriendHelloNew"));
        System.out.println(checkRotation("HelloNewFriend", "FriendNewHello"));
    }
    public static boolean checkRotation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }
        String concatenated = original + original;
        if (concatenated.indexOf(rotation) !=-1) {
            return true;
        } else {
            return false;
        }
    }
}
