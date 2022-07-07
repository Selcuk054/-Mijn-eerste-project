package P11_whileLoop;

import java.util.Scanner;

public class Q03_cift_SayiDondurme {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri dahil
        aralarindaki tum cift tamsayilari while loop kullanarak ekrana yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kucuk baslangic degeri giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen buyuk bitis degeri giriniz");
        int sayi2 = scan.nextInt();
        int ciftSayi = 0;
        int temp1=sayi1;
        int temp2=sayi2;


        /*for (int i = sayi1; i <=sayi2 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }*/
        while (sayi1<=sayi2){
            if(sayi1%2==0){
                System.out.print(sayi1+" ");
            }
            sayi1++;
        }
    }
}
