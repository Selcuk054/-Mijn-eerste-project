package P10_NestedForLoop;

import java.util.Scanner;

public class C02_nestedForLoop {
    public static void main(String[] args) {
        //istenen sayiya gore carpim tablosu olusturun.
        System.out.println("Lutfen bir sayi giriniz");

        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) { // "i" consol da asagiya dogru ekleyip ilerliyor.
            for (int j = 1; j <=sayi ; j++) { // "j" consolda saga dogru ekleyip ilerler
                System.out.print(i*j+" ");
            }
            System.out.println("");

        }



    }
}
