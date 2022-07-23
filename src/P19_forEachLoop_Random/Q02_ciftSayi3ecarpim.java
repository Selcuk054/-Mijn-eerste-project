package P19_forEachLoop_Random;

import java.util.ArrayList;
import java.util.List;

public class Q02_ciftSayi3ecarpim {
    public static void main(String[] args) {


    // Arraydeki tum elemanlari inceleyelim cift sayi olanlari 3 ile carpip liste ekleyelim

    int [] arr={2,4,5,6,7,89,54,65,44,33,22,44,5,};
    List<Integer> sonuc=new ArrayList<>();

        for (int each1:arr
             ) {
            if (each1%2==0){
                each1*=2;
                sonuc.add(each1);

            }
        }
        System.out.println(sonuc);
}
}