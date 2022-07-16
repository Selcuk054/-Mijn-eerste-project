package P17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q04_ListsGet {
    public static void main(String[] args) {
        List<String> steden=new ArrayList<>();
        steden.add("Amsterdam");
        steden.add("Rotterdam");
        steden.add("Sliedrecht");
        steden.add("Utrecht");

        System.out.println(steden.get(0)); //get Bir nevi getir manasinda almak istiyorum. once int deger girip o indexte ne varsa onu getirir.
        System.out.print(steden.get(2));
       // System.out.println(steden.get(4)); //list te olmayan bir index girdigimde 'exeption' hatasi alirim.
    }
}
