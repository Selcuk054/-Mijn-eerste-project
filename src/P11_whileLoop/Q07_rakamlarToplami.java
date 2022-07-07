package P11_whileLoop;

import java.util.Scanner;

public class Q07_rakamlarToplami {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayinin rakamlar toplamini giriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir syi giriniz");
        int num=scan.nextInt();
        int birlerBasamagi=0;
        int rakTop=1;

        while(0<num){
            birlerBasamagi=num%10;
            rakTop+=birlerBasamagi;
            num/=10;

        }
        System.out.println("Girilen sayinin rakamlar Toplami :"+rakTop);

    }
}
