package P08_ForLoop;

import java.util.Scanner;

public class P02_ForLoopTerstenYazdir {
    //Kullanicindan Bir string isteyin ve tersten yazdirin.
    public static void main(String[] args) {

       String cumle=terstenYazdir();
    }
    public static String terstenYazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle = scan.nextLine();

        String cumle1 = cumle.substring(cumle.length()-1);

        for (int i = cumle.length() - 2; i >= 0; i--) {
            cumle1+= cumle.substring(i, i + 1);
        }
        System.out.println(cumle1);

        return cumle;

    }
}
