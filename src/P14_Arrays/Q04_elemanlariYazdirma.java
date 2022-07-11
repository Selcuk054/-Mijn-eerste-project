package P14_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q04_elemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar []={1,2,3,4,5,6,7,8,9};

        //Array in virgusuz ve koseli parantezsiz tum elementleri yazdirin.

        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(sayilar[i]+" ");     // 1 2 3 4 5 6 7 8 9
        }
        // Aralara vvirgul koyup sona koymasini istermezsek

        for (int i = 0; i < sayilar.length; i++) {
            if(i<sayilar.length-1){
                System.out.print(sayilar[i]+", ");
            }else{
                System.out.println(sayilar[i]);
            }


        }



    }
}
