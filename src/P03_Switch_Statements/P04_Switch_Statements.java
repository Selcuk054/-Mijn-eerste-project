package P03_Switch_Statements;

import java.util.Scanner;

public class P04_Switch_Statements {
    //Soru 3-) Kullanicidan bir say girmesini isteyin girilen sayi:
    //10 ise "iki basamakli en kucuk sayi
    //100 ise 3 basamaklien kucuk sayi
    //100 ise dort basamakli en kucuk sayi
    //diger durumlarda gordigin sayiyi degistir yazdirin.
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();

        switch (num) {
            case 10 : System.out.println("Iki basamakli en kucuk sayi"); break;
            case 100 : System.out.println("Uc basamakli en kucuk sayi"); break;
            case 1000 : System.out.println("Dort basamakli en kucuk sayi"); break;
            default: System.out.println("Girdiginiz sayiyi degistirin");
        }
    }
}
