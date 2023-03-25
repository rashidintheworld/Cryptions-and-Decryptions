package az.orient.tasks.ciphercodes;

public class CaesarEncryption {
    public static String CaesarEncrypption(String str, int shift) {
        String cipherText = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i));
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) { //
                    ch = (char) (((ch - 'A') + shift) % 26 + 'A');
                } else {
                    ch = (char) (((ch - 97) + shift) % 26 + 97);
                }
            }
            cipherText += ch;
        }
        return cipherText;
    }
}
