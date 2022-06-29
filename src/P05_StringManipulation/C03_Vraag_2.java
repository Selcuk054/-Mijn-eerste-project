package P05_StringManipulation;

public class C03_Vraag_2 {
    public static void main(String[] args) {
        // String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        // String str1=$13.99
        // String str2=$10.55
        // ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="$10.55";
        str1=str1.replace("$","");
        str2=str2.replace("$","");
        double str01 =Double.parseDouble(str1);
        double str02 =Double.parseDouble(str2);
        System.out.println("Toplam :"+ (str01+str02));


    }
}
