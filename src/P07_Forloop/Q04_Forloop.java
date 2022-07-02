package P07_Forloop;

import java.util.Scanner;

public class Q04_Forloop {
    public static void main(String[] args) {
        //Kullanicidan 100 den kucuk bir tamsayi isteyin 1 den baslayarak girien sayiya
        // kadar 3 un kati olan sayilari yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <sayi ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }

        }
    }
}
