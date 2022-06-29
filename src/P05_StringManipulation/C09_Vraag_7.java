package P05_StringManipulation;

import java.util.Scanner;

public class C09_Vraag_7 {
    public static void main(String[] args) {
        //Kullanicidan ismini soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin.
        // Isim soyisim: M****** B*******
        //Kart no : **** **** **** 1234

        System.out.println("lutfen isminizi soy isminizi ve kart bilgilerinizi giriniz");
        Scanner scan=new Scanner(System.in);

        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        String kartNo= scan.nextLine();
        String kartno2=scan.nextLine().substring(15);

        String isim1=isim.substring(1);
        isim1=isim1.replaceAll("\\w","*");
        String soyisim1=soyisim.substring(1);
        soyisim1=soyisim1.replaceAll("\\w","*");
        String kartNo1=kartNo.substring(0,15);

        kartNo1=kartNo1.replaceAll("\\w","*");




        System.out.print(isim.charAt(0)+isim1);
        System.out.println(" "+soyisim.charAt(0)+soyisim1);
        System.out.println(kartNo1+kartno2);
    }
}
