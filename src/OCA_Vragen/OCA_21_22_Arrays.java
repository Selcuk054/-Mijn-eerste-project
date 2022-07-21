package OCA_Vragen;

import java.util.Arrays;

public class OCA_21_22_Arrays {
    public static void main(String[] args) {
        char[] c=new char[2]; //bu sekilde bir arrayimiz var ve uzunlugunu ogrenmek icin:

        int length=c.length; //burda c nin uzunlugu icin length kullanilir ve parantez sizdir.
        System.out.println(length);//2

        String [][][] maclar=new String[2][2][2];
        System.out.println(Arrays.deepToString(maclar)); //[[[null, null], [null, null]], [[null, null], [null, null]]]

        // soru 22

        int arr1[]={1,2,053,4};

        int arr2[][]={{1,2,4},{2,2,1},{0,43,2}};


        System.out.println(arr1[3]==arr2[0][2]); //esitlik oldugu icinburada cevabi boolean doner --> 4==4  true


        System.out.println(arr1[2]==arr2[2][1]);

        /* arr1[2]==053 burada enteresan birsey var. deger 0 ile basladigi icin decima(octal 8 )degerini hesaplar
        Yani: 3 u 1 ile carpar
        5 i 8 ile carpar
        0 i 64 ile carpar ver sonra sonuclari toplar ==43

        arr2[2][1] degeri arr 2 de 43 e tekabul ediyor. sout un icendede esitmi sorusuna da boolean true olarak donecek.

         */




    }
}
