package P14_Arrays;

import java.util.Arrays;

public class Q05_Onderwerpen {
    public static void main(String[] args) {
        int mijnArray[]={54,34,25,9,98};
        int uzunluk=mijnArray.length;
        System.out.println(uzunluk); //5

        String newArray[]={"john","Ali","kemal"};
        int uzunluk2=newArray.length;
        System.out.println(uzunluk2); //

        /* ONEMLI
        String lerde uzunluk icin ==> length ();
        Arraylaerde uzunluk icin ==> length;    kullanilir

         */

        //Soru 1; Verilen 3 elemanli bir array in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin
        //ornegin: array[1,2,3] ise output [2,3,1]

        int sayi[]={1,2,3};
        int temp=sayi[0]; //bunu ilerde kullanacagiz o yuzen sabitledik

        for (int i = 0; i <sayi.length ; i++) {
            System.out.print(sayi[i]); //123 burda elemanlar yazdirildi.
        }

        for (int i = 0; i <sayi.length-1 ; i++) {
            sayi[i]=sayi[i+1];
        }
        sayi[sayi.length-1]=temp;
        System.out.println(Arrays.toString(sayi)); // [2, 3, 1]

        //Yukaridaki degri eski haline getirmek icin saga kaydiralim.
        temp=sayi[sayi.length-1];

        for (int i = sayi.length-1; i >0 ; i--) {
            sayi[i]=sayi[i-1];

        }
        sayi[0]=temp;
        System.out.println(Arrays.toString(sayi)); //[1, 2, 3]

        //Soru 2- Array in tum elemanlarini toplayan bir program yazdirin

        int aantal[]={34,56,78,90,32,45};
        int toplam=0;

        for (int i = 0; i < aantal.length; i++) {
            toplam+=aantal[i];

        }
        System.out.println(toplam); // 335

        //soru 3 Array in tum elemanlarini carpan bir program yazdirin

        int nummer[]={2,4,3,1,6};
        int carp=1;
        for (int i = 0; i < nummer.length ; i++) {
            carp*=nummer[i];

        }
        System.out.println(carp); //144






    }
}
