package P17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q05_ListSet_Size {

    public static void main(String[] args) {

        List<Integer> postcodes=new ArrayList<>();
        postcodes.add(3344);
        postcodes.add(3343);
        postcodes.add(3342);
        postcodes.add(3346);

        postcodes.set(1,4563);
        System.out.println(postcodes); // set metodu eski elemnti siler. silmesini istemiyorsa add metodu dah kallanisli.
        // [3344, 4563, 3342, 3346]

        postcodes.add(0,2345);
        postcodes.set(3,1987);
        postcodes.addAll(1,postcodes);
        System.out.println(postcodes); //[2345, 2345, 3344, 4563, 1987, 3346, 3344, 4563, 1987, 3346]

        System.out.println(postcodes.size()); //10



    }

}
