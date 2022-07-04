package P08_ForLoop;

import java.util.Scanner;

public class P01_ForLoopTerstenYazdir {
    public static void main(String[] args) {

        //Kullanicindan Bir string isteyin ve tersten yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String cumle=scan.nextLine();
        String tersten=cumle.substring(cumle.length()-1);

        for (int i = cumle.length()-2; i >=0; i--) {
            tersten+=cumle.substring(i,i+1);
           System.out.println(tersten);
        }


    }
}
