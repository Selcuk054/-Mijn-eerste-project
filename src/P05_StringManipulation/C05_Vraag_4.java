package P05_StringManipulation;

import java.util.Scanner;

public class C05_Vraag_4 {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyisismini isteyin hangisinin daha uzun oldugunu yazdirin.

        System.out.println("Lutfen isminizi ve enter a basip soy isminizi giriniz");
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("Yazdiginiz isim soyisimden daha uzundur");
        }else if (isim.length()<soyisim.length())   {
            System.out.println("Yazdiginiz soyisim isimden daha uzundur");
        }else {
            System.out.println("isim ve soyisim ayni uzunluktadir");
        }

    }
}
