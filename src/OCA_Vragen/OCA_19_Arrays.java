package OCA_Vragen;

import java.util.Arrays;

public class OCA_19_Arrays {
    public static void main(String[] args) {
       /*Bir array olusturmak icin;
        -Ya elemanlariyla birlikte yazik declare edebilir
        Mesela: int arr[]={3,5,7,9}
        - Ya da yeni bir array olustur deriz ve data turu ile array in buyulugunu unutmadan:
        Mesela: String sinif []= new String[25];

        SORU: Asagidaki array deklerasyonlarinin hangileri dogru degildir?

        */
        //a-)
        int [][] scores= new int[5][]; //bunu yazdirmak icin
        System.out.println(Arrays.deepToString(scores)); // ic ice oldugu icin deep to kullaniyoruz. //[null, null, null, null, null]

        //b-)
        Object[][][] cubbies=new Object[3][2][9];
        System.out.println(Arrays.deepToString(cubbies));//[[], [], []]
        // Dis array 3 elemanli oldugu icin icte 3 array yazdirdi fakat bunlarin icinde ikinci orak 0 yazdigi icin bos arrray yazdirdi.

        //3-)
     //   String beans[]= new beans[6]; //new den sonra ismini degil data turunu yazmasi gerekiyordu o yuzden hata alir.
        //duzeltmeyi denersek
        String beans[]= new String[6];
        System.out.println(Arrays.toString(beans)); //[null, null, null, null, null, null]

        //4-)
       // int[][] types=new int[]; // burada eksik olan new den sonraki int de birtane daha [] olmali ve array in boyutunu yazmali.
        //duzeltmeyi denersek:
        int [][] types=new int[4][3];
        System.out.println(Arrays.deepToString(types)); //[null, null, null, null]

        //5-)
       // int [][] java= new int[][]; buradaki eksik te sagdaki arrayin icinde length eksik o yazildigi zaman hata cozuluyor.
        int [][] java=new int[3][];
        System.out.println(Arrays.deepToString(java)); //[null, null, null]







    }
}
