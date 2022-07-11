package P14_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03_arraysLength {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5};

        String harfler[]=new String[4];

        System.out.println("Sayilar Array inin uzunlugu :"+sayilar.length);
        System.out.println("Herfler Array inin uzunlugu :"+harfler.length);

        System.out.println(Arrays.toString(sayilar)); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]

        //String length() methodunda parantez var array de yok.

        //harfler Array inin son elementi yazdiriniz.
        harfler[3]="Q";

        System.out.println(harfler[harfler.length-1]);






    }
}
