package P17_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11_arrayListSlaytSorulari {
    public static void main(String[] args) {
        //Soru 1- Elemanlari A,C,E ve F olan bir String Arraylist olusturup ekrana yazdirin

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler); // [A, C, E, F]

        //Soru 2- Indexsiz add() methodunu kullanara B yi ekleyiniz.
        // indexli add() methodunu kullanrak L yi 1 numarali index e ekleyiniz.
        // ArrayListleri ekrana Yazdirin liste su sekilde olmali : A,L,C,E,F,B

        harfler.add("B");
        harfler.add(1,"L");
        System.out.println(harfler); //[A, L, C, E, F, B]

        //Soru 3- set(methodu kullanarak E'yi D yapiniz, ve yazdiriniz

        harfler.set(3,"D");
        System.out.println(harfler); //[A, L, C, D, F, B]

        //Soru 4- remove() metodu kullanrak F yi siliniz
        harfler.remove("F");
        System.out.println(harfler);//[A, L, C, D, B]

        //Soru 5- sort methodu kullnarak elemanlari siraya diziniz

        Collections.sort(harfler);
        System.out.println(harfler); //[A, B, C, D, L]

        // Soru 6- contain() ile L nin var oldugunu M in olmadigini belirten code yaziniz

        System.out.println(harfler.contains("L"));//true
        System.out.println(harfler.contains("M"));//false

        //soru 7 size() methodu ile list in kac elemanli oldugunu yazdirin

        System.out.println(harfler.size());//5

        //soru 8 clear methodu ile tum elemanlari siliniz
        //soru 9 is empty ile listenin bos oldugunu yazdirin

        harfler.clear();
        System.out.println(harfler.isEmpty());// true





    }
}
