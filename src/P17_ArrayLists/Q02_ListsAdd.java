package P17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q02_ListsAdd {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Ufuk");
        isimler.add("Ahmet");
        isimler.add("Selcuk");
        isimler.add("Huriye");

        System.out.println(isimler);
        isimler.add(2,"Kardes"); //indexi 2 olan yere isim ekledik

        System.out.println(isimler);


    }
}
