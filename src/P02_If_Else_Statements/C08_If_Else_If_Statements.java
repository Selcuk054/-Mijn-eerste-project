package P02_If_Else_Statements;

import java.util.Scanner;

public class C08_If_Else_If_Statements {
    public static void main(String[] args) {
        //Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin
        // teklif 80.000 uzerinde ise kabul ediyorum,
        //60.000-80.000 arasi ise konusabiliriz
        //60.000 altinda ise malesef kabul edemem. yazdirin

        System.out.println("Lutfen maas teklifinizi giriniz");
        Scanner scan=new Scanner(System.in);
        int maas= scan.nextInt();

        if (maas>80000){
            System.out.println("Kabul ediyorum");
        } else if (maas>60000){
            System.out.println("Konusabiliriz");
        }else {
            System.out.println("Malesef kabul edemem");
        }
    }
}
