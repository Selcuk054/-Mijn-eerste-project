package P03_Switch_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P02_Switch_Statements {
    public static void main(String[] args) {
        //Soru-1) Kulanicidan haftanin kacinci gun oldugunu sorun ve gun ismini yazdirin.
        System.out.println("Lutfen 1-7 arasinda bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        switch (sayi){
            case 1 : System.out.println("Maandag"); break;
            case 2 : System.out.println("Dinsdag"); break;
            case 3 : System.out.println("Woensdag"); break;
            case 4 : System.out.println("Donderdag"); break;
            case 5 : System.out.println("Vrijdag"); break;
            case 6 : System.out.println("Zaterdag"); break;
            case 7 : System.out.println("Zondag"); break;
            default: System.out.println("Lutfen gecerli bir sayi giriniz");


        }
    }
}
