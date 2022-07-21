package P14_Arrays;

import java.util.Arrays;

public class Q06_sort {
    public static void main(String[] args) {

        //Soru 1- Olusturdugunuz array in icndeki elemenleri kucukten buyuge dogru siralayiniz.

        int aantal[]={6,34,9,10,43,23,8};
        Arrays.sort(aantal);
        System.out.println(Arrays.toString(aantal)); //[6, 8, 9, 10, 23, 34, 43]

        //Soru 2 soru 1 deki array in icindeki elementleri buyukten kucuge dogru siralayiniz.

        for (int i = aantal.length-1; i >=0 ; i--) { //length -1 yazmayiinca 7 deger var fakat 7. index olmadigi
                                                     // icin hata veriyor, baslamiyor
            System.out.print(aantal[i]+" ");

        }
    }
}
