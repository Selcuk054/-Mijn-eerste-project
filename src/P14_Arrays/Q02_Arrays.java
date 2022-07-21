package P14_Arrays;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];
        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar));

        sayilar[1]=45;
        sayilar[2]=99;
        sayilar[0]=110;

        System.out.println(Arrays.toString(sayilar));

        String siniflist[]={"John","Michael","Tom"};
        System.out.println(Arrays.toString(siniflist));

        siniflist[2]="Kemal";
        System.out.println(Arrays.toString(siniflist));


        //new practice

        int mijnArray[]=new int[5]; //5 elemanli bir array olusturduk.
        mijnArray[0]=12;
        mijnArray[1]=34;
        mijnArray[2]=90;

        System.out.println(Arrays.toString(mijnArray)); //[12, 34, 90, 0, 0]
        //of
        int mijnArray2[]={2,4,6,7,88,99,44}; //Olusturma ve tum indexler icin deger atamasi tek seferde yapilabilir.
        System.out.println(Arrays.toString(mijnArray2));

        //Soru 1 :Elemanlari ali veli ayse fatma olan bir array olusturun ve yazdirin.

        String namen[]={"Ali","Veli","Ayse","Fatma"};
        System.out.println(Arrays.toString(namen)); //[Ali, Veli, Ayse, Fatma]

        //Array in elemanlarina ulasma ve uodate etme
        //Soru 2 Soru 1 deki elemanlardan Ali verine can, ayse yerine gul yazdirin

        namen[0]="Can";
        namen[2]="Gul";
        System.out.println(Arrays.toString(namen)); // [Can, Veli, Gul, Fatma]





    }
}
