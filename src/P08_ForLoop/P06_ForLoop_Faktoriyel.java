package P08_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P06_ForLoop_Faktoriyel {
    // Kullanicidan 10'dan kucuk bir sayi isteyin ve girilen sayinin faktoryel ini bulun.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir tamsayi giriniz");
        int num=scan.nextInt();
        int totaal=1;
        // Burda totaal e ilk olarak bir deger atadim fakat bu deger etkisiz olmasi gerektigini ogrendim.
        // ilkinde 0 degerini atamistim fakat carpim islemi yaptigindan devamli sifir sonucunu aldim.
        //1 degerini verdikten sonra duzgun calisti.

        if (num<0){
            System.out.println("Lutfen gecerli bir sayi giriniz");

        }else if (num>0 && num<10){

            for (int i=1; i <=num ; i++) {
                totaal*=i;
            }
            System.out.println("Deger :"+totaal);
        }else {
            System.out.println("Lutfen gecerli bir sayi giriniz");

    }
}
}
