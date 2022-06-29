package P02_If_Else_Statements;

import java.util.Scanner;

public class C06_If_Else_If_Statements {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin, sayilarin ikiside pozitif ise sayilarin toplamini yazdirin.
        //sayilarin ikiside negatif ise sayilarin carpimini yazdirin,
        // sayilarin ikiside farkli isaretlere sahipse "farkli isaretlerde sayilar islem yapamaz"
        //yazdirin. sayilardan sifira esitolan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        System.out.println("Lutfen iki sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int s1= scan.nextInt();
        int s2= scan.nextInt();

        if ((s1>0) && (s2>0)){
            System.out.println("Sayilarin Toplami :"+(s1+s2));
        } else if ((s1<0) && (s2<0)){
            System.out.println("Sayilarin Carpimi :"+s1*s2);
        } else if (((s2<0) && (s1>0)) || ((s2>0) && (s1<0))) {
            System.out.println("Farkli isaretlerde sayilar islem yapamaz");
        } else {
            System.out.println("Sifir carpmaya gore yutan elemandir");
        }

    }
}
