package P21_Vragen;

import java.util.Scanner;

public class Q02_EnUzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        System.out.println("Lutfen Bir Cumle Gririniz");
        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine();

        enUzunKelime(cumle);
        System.out.println(enUzunKelime(cumle));


    }

    public static String enUzunKelime(String cumle) {
        String[] arr=cumle.split(" ");
        int maximum=0;
        String longstWord="";

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i].length()>maximum){
                maximum=arr[i].length();
                longstWord=arr[i];
            }

        }
return longstWord;
    }
}
