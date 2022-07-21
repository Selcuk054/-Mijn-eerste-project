package OCA_Vragen;

import java.util.Arrays;

public class OCA_23_binarySearch {
    public static void main(String[] args) {
        int [] random1={16,45,112,10,-110};

        int x=10;
        int y= Arrays.binarySearch(random1,x);
        System.out.println(y); //-1//sort yapmadan once bu yapildigi icin java 112 yi baz alip dusuk bir
                               // sayi ise solda arayacak ve bulamadigini soyledi.

    }
}
