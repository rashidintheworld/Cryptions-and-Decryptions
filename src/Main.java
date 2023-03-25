import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //salam necesen
        String[] strSp = str.split(" ");
        char[] chrs = "aouie".toCharArray();
        String saitMax = "";
        int saitMaxLen = 0;
        for (String i : strSp) {
            int countOfVowel = 0;
            for (int k = 0; k < i.length(); k++) {
                for (int j = 0; j < chrs.length; j++) {
                    char ch = i.charAt(k);
                    if (ch==chrs[j]){
                        countOfVowel++;
                    }
                }
            }
            if(countOfVowel>saitMaxLen){
                saitMaxLen=countOfVowel;
                saitMax=i;
            } else if (countOfVowel==saitMaxLen) {
                saitMax+=" "+i;
            }
        }
        System.out.println("En cox saitli soz -> "+ saitMax);
    }
}