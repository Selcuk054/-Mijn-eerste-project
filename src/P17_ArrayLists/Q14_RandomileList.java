package P17_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q14_RandomileList {
    /*
    Icinde 500 tane 5000 den kucuk pozitif tamsayi olan bir list olusturun kullanicidan bir sayi isteyip
    Listede olup olmadigini kullaniciya yazalim.
     */
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while(sayiListesi.size()<500){
            sayi=rnd.nextInt(5000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);

        boolean buldunMu=false;
        int tahminSayisi=1;
        Scanner scan =new Scanner(System.in);

        while(!buldunMu){
            System.out.println("Lutfen bir sayi tahmininde bulununuz");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler "+tahminSayisi+" adet tahminde listeden bir sayi buldunuz");
                buldunMu=true;
            }else{
            System.out.println(tahminSayisi + "adet tahminde bulundunuz ama hicbiri listede bulnmamaktadir");
            tahminSayisi++;
        }
        }


    }
}
