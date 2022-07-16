package P17_ArrayLists;


import java.util.ArrayList;
import java.util.List;

public class Q01_ListsAdd {
    public static void main(String[] args) {



    List<Integer> sayilar=new ArrayList<>(); //Simdi bir liste olusturdum icini dolduracagim.
        //List primitive data turlerini kabul etmez buyuzden (type argument cannot be of primitive type)
    System.out.println(sayilar); //[]
        //ekleme yapmak icin
        sayilar.add(3);
        sayilar.add(15);
        sayilar.add(9);
        sayilar.add(16);
        System.out.println(sayilar);

        System.out.println(sayilar.add(14)); // true cevabi geldi demek oluyorki "gittim ekledim" onayi anlaminda

        // Stringde yada

        System.out.println(sayilar); //[3, 15, 9, 16, 14]
        //Stringde sayi assign ettigimizde ilk string degismiyordu fakat list te degisiyor.


        sayilar.add(1,33); //indexi 1 olan yere 33 sayisini ekle
        System.out.println(sayilar); //[3, 33, 15, 9, 16, 14]




}
}