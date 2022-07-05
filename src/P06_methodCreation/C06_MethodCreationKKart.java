package P06_methodCreation;

import java.util.Scanner;

public class C06_MethodCreationKKart {

    public static void main(String[] args) {
        /*
        Kullanicidan ismini soyisimini ve bosluk birakmadan 16 hane olarak kredi kart numarasini alin
        Isim ve soyismi ilk harfleri buyuk diger harfleri kucukolacak sekile, KK numarasini ise 
        4 rakamlik 4 blok ve aralarda bosluk olacak sekilde duzelten 2 method yazin, ve programda 
        kullanilabilecek hallerini dondurun.
         */

        String naam, achterNaam = volNaam();
        KaartNo();


    }

    public static String KaartNo() {
        System.out.println("Kredikart numaranizi bosluk birakmadan giriniz");
        Scanner scan=new Scanner(System.in);
        String num= scan.nextLine();
        System.out.println(num.substring(0,4)+" "+num.substring(4,8)+" "+ num.substring(8,12)+
                " "+num.substring(12,16));
        return num;
    }

    public static String volNaam() {
        System.out.println("Schrijf uw naam en achternaam aub!");
        Scanner scan = new Scanner(System.in);
        String naam = scan.nextLine();
        String achterNaam = scan.nextLine();
        System.out.println(naam.substring(0,1).toUpperCase() + naam.substring(1).toLowerCase()+" "+
                achterNaam.substring(0, 1).toUpperCase()+ achterNaam.substring(1).toLowerCase());

        return naam+achterNaam;

    }


}
