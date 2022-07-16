package P17_ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q07_remove {
    public static void main(String[] args) {

        List<String> namen=new ArrayList<>();
        namen.add("Jack");
        namen.add("Martin");
        namen.add("John");
        namen.add("Adam");

        System.out.println(namen);
        System.out.println(namen.remove("john"));// basharfi kucuk oldugu icin bulamayip false getirdi.
        System.out.println(namen.remove("Jack"));//true
        System.out.println(namen); // [Martin, John, Adam]

        System.out.println(namen.remove(1));//John  getirdi ve sildi.
        System.out.println(namen); // [Martin, Adam]





    }
}
