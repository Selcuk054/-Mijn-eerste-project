package P03_Switch_Statements;

import java.util.Scanner;

public class P03_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan kacinci ay oldugunu sorunve ay ismini yazdirin.
        System.out.println("Kacinci ayi tercih edersiniz");
        Scanner scan=new Scanner(System.in);
        int maand= scan.nextInt();

        switch (maand){
            case 1 : System.out.println("Januari"); break;
            case 2 : System.out.println("Februari"); break;
            case 3 : System.out.println("Maart"); break;
            case 4 : System.out.println("April"); break;
            case 5 : System.out.println("Mei"); break;
            case 6 : System.out.println("Juni"); break;
            case 7 : System.out.println("Juli"); break;
            case 8 : System.out.println("Augustus"); break;
            case 9 : System.out.println("September"); break;
            case 10 : System.out.println("Oktober"); break;
            case 11 : System.out.println("November"); break;
            case 12 : System.out.println("December"); break;
            default: System.out.println("Lutfen gecerli bir sayi giriniz");
        }
    }
}
