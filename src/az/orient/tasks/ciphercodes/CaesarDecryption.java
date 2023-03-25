package az.orient.tasks.ciphercodes;

import java.util.Scanner;

public class CaesarDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edin->");
        String str = sc.nextLine();
        int shift = sc.nextInt();
    }

    public static String CaesarDecryption(String str, int shift) {
        String cipherText = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i));
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) { //
                    ch = (char) (((ch - 'A') - shift+26) % 26 + 'A');
                } else {
                    ch = (char) (((ch - 'a') - shift+26) % 26 + 'a');
                }
            }
            cipherText += ch;
        }
        return cipherText;
    }
}
