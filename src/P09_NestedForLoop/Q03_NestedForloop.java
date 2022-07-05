package P09_NestedForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q03_NestedForloop {
    public static void main(String[] args) {
        //Kullanicidan pozotof bir rakam girmesini isteyin.
        // ve girilen rakama gore carpim tablosu olusturun.
        //123
        //246
        //369

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(" "+i*j);
            }
            System.out.println(" ");
        }
    }
}





