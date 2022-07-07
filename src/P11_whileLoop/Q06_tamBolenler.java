package P11_whileLoop;

import java.util.Scanner;

public class Q06_tamBolenler {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam
        kac tane olduklarini ekranda yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int num=scan.nextInt();
        int i=1;
        int tamBolSay=0;

        while(i<=num){
            if (num%i==0){
                System.out.println(i+" ");
                tamBolSay+=1;
            }i++;

        }System.out.println("Tam Bolen Sayi Toplami = " + tamBolSay);


    }
}
