package P08_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P05_Forloop_AraSayiToplami {
    //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tam sayilari
    //toplayip, sonucu yazdiran bir program girin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int num1= scan.nextInt();
        System.out.println("Lutfen ikinci sayisi giriniz");
        int num2=scan.nextInt();
        int toplam=0;

        if (num1<num2) {
            for (int i=num1; i<=num2; i++) {
                toplam+=i;
            }
        }else if (num2<num1){
            for (int i=num2 ; i<=num1; i++){
                toplam+=i;
            }
        }else if(num2==num1) {
            toplam=num1+num2;

        }else{
            System.out.println("Lutfen gecerli bir deger giriniz");
        }
        System.out.println("Aralarindaki sayilar toplami :"+toplam);

    }
}
