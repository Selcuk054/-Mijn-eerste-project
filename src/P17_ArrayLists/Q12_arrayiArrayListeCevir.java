package P17_ArrayLists;

import java.util.Arrays;
import java.util.List;

public class Q12_arrayiArrayListeCevir {
    public static void main(String[] args) {



    String [] hayvan={"Kus","Zurafa","Gergedan"}; //uc elemanli hayvan adinda bir array olustruduk
    List<String> hayvan2= Arrays.asList(hayvan);  //bu arrary i liste cevirdik

        System.out.println(hayvan2);//[Kus, Zurafa, Gergedan]

      //  hayvan2.add("kopek"); // bu list e element eklemeye calsitigimizda exeption veriyor.

        // --> Bu cevirilen list (hayvan2) UZUNLUGU DEGISTIRILEMEYEN BIR LIST OLUR.

        // Ustteki array in (hayvan) elementlerinde degisiklik yaparsak List tekilerde otomatik olarak degisir.


        Integer [] yaslar={22,34,12,34,23};
        List <Integer> yaslar2=Arrays.asList(yaslar);
        System.out.println(yaslar2); //[22, 34, 12, 34, 23]








}
}