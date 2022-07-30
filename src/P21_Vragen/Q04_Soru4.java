package P21_Vragen;

import java.util.Scanner;

public class Q04_Soru4 {
    public static void main(String[] args) {
        System.out.println("Lutfen dakika giriniz");
        Scanner scan=new Scanner(System.in); // 3456789 dakika
        int dakika= scan.nextInt();
        int yil=0;
        int gun=0;

        yil=dakika/(365*24*60);

        int artanDakika=dakika - (yil*(365*24*60));

        gun=artanDakika/(24*60); //artan dakikayi bolerken24 ve 60 parantez icinde kalmali.

        System.out.println(dakika +" dakika,"+" yaklasik "+yil+" yil ve "+ gun+" gundur.");
    }

}
