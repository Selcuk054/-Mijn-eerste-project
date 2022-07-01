package P06_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {
    public static void main(String[] args) {
        // verilen 5 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim.
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        rakamlariTopla(sayi);
       C01_MethodCreation.terstenYazdir("Ufuk"); //C01 deki tersten yazdir methodunu buraya cagirdik.


    }

    public static void rakamlariTopla(int sayi) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println("Rakamlar Toplami :"+rakamlarToplami);

    }
}
