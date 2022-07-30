package P21_Vragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deneme {

    public static void main(String[] args) {
        int myArray[]={3,5,7,8};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(45);
        sayilar.add(98);
        System.out.println(sayilar.size());


        //Liste eleman ekleme
        List<Integer> sayilarim=new ArrayList<>();
        sayilarim.add(45);
        sayilarim.add(33);
        sayilarim.add(22);
        sayilarim.add(0,212); //kacinci indexte olmasini istedigimizde.

        //Yada

        List<Integer> sayilarim2=new ArrayList<>(List.of(34,45,56,67,78,65,54,4332));
        System.out.println(sayilarim2);
        System.out.println("sayilarim = " + sayilarim);

        //ve dahasi

        List<String> ulkeler=new ArrayList<>(Arrays.asList("Almanya","Hollanda","Belcika","Amerika"));
        System.out.println("ulkeler = " + ulkeler);

         // n sayida ayni list uyesi olusturmak icin
        List<String> ulke=new ArrayList<>(Collections.nCopies(12,"Hollanda"));
        System.out.println("ulke = " + ulke);

        ArrayList<Integer> listParcasi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 18, 9));

        System.out.println(listParcasi);

        // list.subList(2,5); 2. index dahil, 5. index haric
        System.out.println("2. index dahil, 5. index haric parcası alındı : " + listParcasi.subList(2, 5));

        ArrayList<Integer> yeniList = new ArrayList<>(listParcasi.subList(4, 8));
        System.out.println("yeniList = " + yeniList);
        Collections.reverse(listParcasi);
        System.out.println("yeniList reverse Hali = " + yeniList);

        ArrayList<Integer> ipek = new ArrayList<>(Arrays.asList(45, 23, 67, -100, 1, 0));
        System.out.println("ilk hali: reverse olmadan : "+ipek);
        Collections.reverse(ipek);
        System.out.println("reverse hali : "+ipek);


    }
}
