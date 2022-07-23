package P19_forEachLoop_Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q04_randomIleSayi {
    public static void main(String[] args) {
        // Random ile 100 tane 1000 den kucuk sayi bul ve bu sayilarin cift sayi olanlarini 3 ile carp ve listte yazdir.

        Random rnd=new Random();
        int sayi=0;
        List<Integer> listem=new ArrayList<>();
        List<Integer> listem2=new ArrayList<>();

        while(listem.size()<100) {
            sayi = rnd.nextInt(1000);
            listem.add(sayi);
        }
        System.out.println("Rasgele secilen 100 sayi :"+listem);

        for (int each1:listem
             ) {
            if (each1%2==0){
                each1*=3;
                listem2.add(each1);
            }
        }System.out.println("3 ile carpilan ciftler :"+listem2);
    }
}
