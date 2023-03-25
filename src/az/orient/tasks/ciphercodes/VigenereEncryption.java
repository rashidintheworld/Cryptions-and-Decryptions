package az.orient.tasks.ciphercodes;

import java.util.Scanner;

public class VigenereEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil et->");
        String str = sc.nextLine().toUpperCase();
        String key = sc.nextLine().toUpperCase();
    }
    public static String VigenereEnc(String str,String key){
        String resultTxt = "";
        String cipherTxt = "";
        while (cipherTxt.length()<str.length()){
            resultTxt+=key;
        }
        for(int i = 0 ; i<str.length() ;i++){
            char ch1 = str.charAt(i);
            char ch2 = resultTxt.charAt(i);
            cipherTxt+=(char) (ch2+ch1)%26+'A';
        }
        return cipherTxt;
    }
}
