package P17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q06_indexOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.indexOf("Cay")); // index of da objenin adini yaziosun bastan baslayip ilk buldugu o objenin indexini veriyor.
        System.out.println(urunler.lastIndexOf(" Cekirdek")); //-1 verme sebebi cekirdek ten once bir bosluk unutulmu :)
        System.out.println(urunler.lastIndexOf("Cay"));//3

        //Bir kac obje daha ekleyi p bakaklim

        urunler.addAll(urunler);
        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay, Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.lastIndexOf("Cekirdek"));// last index te sondan bakmaya basliyor ve ilk buldugunda index degerini yazdiriyor

        System.out.println(urunler.lastIndexOf("Hobby")); //-1  bulunmadigi icn bunu verdi
    }
}
