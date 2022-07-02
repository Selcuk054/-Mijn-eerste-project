package P07_Forloop;

import java.util.Scanner;

public class Q06_Forloop {
    public static void main(String[] args) {
        //Kullanicidan 100 den kucuk bir sayi isteyin 1 den baslayarak girilen sayiya kadar
        //3 un kati yerine Java
        //5 in kati yerine guzeldir
        // sayi hem 3 un hem 5 in kati ise sayi yerine java guzeldir yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if(i%15==0){
                System.out.println("java guzeldir");
            }else if (i%5==0){
                System.out.println("guzeldir");
            }else if (i%3==0){
                System.out.println("java");
            }else
                System.out.println(i+" ");

        }

    }
}
