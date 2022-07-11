package P12_doWhileLoop;

import java.util.Scanner;

public class Q04_0Komutu {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek
        icin 0'a basmasini soyleyin.
        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
         */

        System.out.println("Lutfen toplamasini istediginiz ssayilari giriniz");
        int sayi=0;
        int pozitifSayiAdedi = 0;
        int pozitifSayiTopl =0 ;
        do{
            Scanner scan = new Scanner(System.in);
            sayi = scan.nextInt();
            if (sayi>0){
                pozitifSayiTopl+=sayi;
                pozitifSayiAdedi++;
            }
        }while(sayi!=0);
        System.out.println(pozitifSayiAdedi+ "adet pozitif sayi girdiniz :");
        System.out.println("Girdiginiz pozitif sayilar toplami :"+pozitifSayiTopl);



    }
}