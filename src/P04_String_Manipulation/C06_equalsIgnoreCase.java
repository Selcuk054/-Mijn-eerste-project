package P04_String_Manipulation;

public class C06_equalsIgnoreCase {
    public static void main(String[] args) {
        //equalsignore verilen iki string degiskenin buyuk kucuk harf farki gozetmeksizin kontrol eder.

        String name= "UFUK";
        String name1= "Ufuk";
        String name2= "ufuk";

        System.out.println(name.equalsIgnoreCase(name2)); //true
        System.out.println(name.equals(name2)); //false
    }
}
