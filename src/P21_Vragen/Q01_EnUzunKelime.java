package P21_Vragen;

import java.util.Scanner;

public class Q01_EnUzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        System.out.println("Lutfen bir cumle giriniz");
        Scanner scan = new Scanner(System.in);
        String goedeZin = scan.nextLine();
        LangsteWord(goedeZin);

        System.out.println("Cumlenin en uzun kelimesi :" + LangsteWord(goedeZin));

         // Ik hou van jullie.
    }

    public static String LangsteWord(String goedeZin) {

        String[] arr = goedeZin.split(" "); //String i Array e cevirmek icin.
        int maximum = 0;
        String lange = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maximum) {
                maximum = arr[i].length(); //maxmum ile calistiginda ilk kelimenin uzunlugu olur.
                lange = arr[i];
            }
        }
        return lange;
    }
}





