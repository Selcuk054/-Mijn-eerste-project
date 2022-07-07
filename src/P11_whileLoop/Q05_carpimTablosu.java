package P11_whileLoop;

import java.util.Scanner;

public class Q05_carpimTablosu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir rakam alin bu rakami
        icin carpim tablosunu ekrana yazdirin. Kullanicinin hata yapmadigini farzedin.
         */
        System.out.println("Lutfen bir rakam giriniz");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int i=1;


            while(i<=10) {
                System.out.print(num+"X"+i+"="+num*i+" ");
                i++;

        }
            i++;
    }
}
//for (int i = 1; i <=10; i++)