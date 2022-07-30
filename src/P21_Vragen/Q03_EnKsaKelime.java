package P21_Vragen;

import java.util.Scanner;

public class Q03_EnKsaKelime {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en kisa ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */

    public static void main(String[] args) {

        System.out.println("Lutfen bir cumle giriniz");
        Scanner scan=new Scanner(System.in);
        String cumle = scan.nextLine();

        enKisaKelime(cumle);
        System.out.println(enKisaKelime(cumle));

    }

    public static String enKisaKelime(String cumle) {
        String [] arr=cumle.split(" ");
        int min=0;
        String kisaKelime="";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()<min) {
                min = arr[i].length();
                kisaKelime = arr[i];

            }
        }


        return kisaKelime;
    }

}
