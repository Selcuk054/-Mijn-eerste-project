package P15_Vragen;

import java.util.Scanner;

public class Q01_rakamlarToplami {

    public static void main(String[] args) {
      //  1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen rakamlarinin toplanmasini istediginiz sayiyi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        while(sayi>0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        System.out.println("girilen sayinin rakamlar toplami "+toplam);
        }
        }


