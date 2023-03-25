package az.orient.tasks.ciphercodes;

public class VigenereDecryption {
    public static String VigenereDec(String str,String key){
        String result = "";
        String cipherTxt = "";
        while(cipherTxt.length()<str.length()){
            result+=key;
        }
        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = result.charAt(i);
            if((ch2-ch1)<0){
                cipherTxt += (char) ((ch1-ch2+26)%26+'A');
            }else {
                cipherTxt+= (char) ((ch1-ch2)%26+'A');
            }
        }
        return str;
    }
}
