package P02_If_Else_Statements;

import java.util.Scanner;

public class C01_If_Else_Statements {
    public static void main(String[] args) {
        // Soru 01 Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve
        //dikdortgenin kare olup olmadigini yazdirin.
        System.out.println("Lutfen arada enter tuslayarak iki deger giriniz ");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        if (num1==num2){
            System.out.println("Bu bir karedir");
        }else {
            System.out.println("Bu bir kare degildir");
        }
    }

}
