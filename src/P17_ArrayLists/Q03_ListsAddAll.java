package P17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q03_ListsAddAll {
    public static void main(String[] args) {
        List<Integer> aantallen=new ArrayList<>();
        aantallen.add(45);
        aantallen.add(43);
        aantallen.add(56);
        aantallen.add(54);

        List<Integer> aantallen2=new ArrayList<>();
        aantallen2.add(2);
        aantallen2.add(5);
        aantallen2.add(6);
        aantallen2.add(9);

        aantallen.addAll(1,aantallen2); //Listin tamamini hangi index e ekleyecegimizi belirleyip ekleme
        System.out.println(aantallen);  //[45, 2, 5, 6, 9, 43, 56, 54]


    }
}
