package P14_Arrays;

import java.util.Arrays;

public class Q07_binarySearch {
    public static void main(String[] args) {
        //Soru 1- Olusturdugunuz int bir array de bie elemanin varligini kontrol ediniz

        int sayilar[]={23,45,67,55,43,23,67,89};
        //oncelikle mutlaka siraya sokmaliyiz

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); //[23, 23, 43, 45, 55, 67, 67, 89]

        System.out.println(Arrays.binarySearch(sayilar,45)); // 3 olarak dondu
        System.out.println(Arrays.binarySearch(sayilar,33)); // bu deger yok olsa idi sira numarasi kac olurdu
                                                                 // onnu basinda eksi ile yaziyor. Yani= -3


        // Soru2- String elementlerden olusan bir array olusturun ve bir elemanin varlgini kontrol ediniz

        String sehirler[]={"Sliedrecht","Venlo", "Dordrecht","Utrecht"};
        Arrays.sort(sehirler);
        System.out.println(Arrays.toString(sehirler)); //[Dordrecht, Sliedrecht, Utrecht, Venlo]
        System.out.println(Arrays.binarySearch(sehirler,"Sliedrecht")); // 1


    }
}
