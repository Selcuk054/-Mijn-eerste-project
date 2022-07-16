package P17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q08_arraydenListYapma {
    public static void main(String[] args) {

        Integer[] arr={2,3,4,3,2,1,2,3,4,5,4,3,2,3,4};
        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2, 3, 4]
    }
}
