package P17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_ArrayListiArrayaCevirme {
    public static void main(String[] args) {
        List<String> hayvan1=new ArrayList<>();
        hayvan1.add("Kopek");
        hayvan1.add("Kedi");
        hayvan1.add("Bukalemun");


        // 1. yontem
        String hayvan2[]=hayvan1.toArray(new String[0]);
        System.out.println(Arrays.toString(hayvan2)); //[Kopek, Kedi, Bukalemun]

        //2. yontem
        Object hayvan3[]=hayvan1.toArray();
        System.out.println(Arrays.toString(hayvan3)); //[Kopek, Kedi, Bukalemun]

    }
}
