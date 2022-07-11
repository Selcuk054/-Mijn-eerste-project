package P12_doWhileLoop;

import java.util.Scanner;

public class Q05_topl500sorusu {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak icin sayi isteyin ve toplam 500 ulasincaya kadar istemeye devam ettirin
        Toplam 500 e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=+sayi;

        do {

        System.out.println("Lutfen bir sayi giriniz");
        sayi=scan.nextInt();

        if (toplam>500){
            toplam+=sayi;
        }else if (toplam<=500){
            System.out.println(toplam);

        }

        }while (sayi<=500); {

        }



    }
}
