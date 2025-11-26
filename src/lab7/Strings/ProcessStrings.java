package lab7.Strings;

public class ProcessStrings implements Stroka{
    public static int len(String s){
        return s.length();
    }
    public static String odd(String s){
        String a ="";
        for (int i = 0; i < len(s); i+=2){
            a+=s.charAt(i);
        }
        return a;
    }

    public static String inverse(String s){
        String a = "";
        for (int i = len(s)-1;i>=0;i--){
            a+=s.charAt(i);
        }
        return a;
    }
}
