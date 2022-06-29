package P02_If_Else_Statements;

import java.util.Scanner;

public class C05_If_Else_If_Statements {
    public static void main(String[] args) {
        //Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun isminin
        //1.2.3. harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi gecerli degilse
        // "Geceri gun ismi giriniz" yazdirin.
        System.out.println("Lutfen gun ismini giriniz");
        Scanner scan=new Scanner(System.in);
        String gun=scan.next().toLowerCase();

        if ((gun.equals("pazartesi")) || (gun.equals("pazar"))){
            System.out.println("Paz");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")){
            System.out.println("Per");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if ((gun.equals("cuma")) || (gun.equals("cumartesi"))){
            System.out.println("Cum");
        } else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }

    }

}
