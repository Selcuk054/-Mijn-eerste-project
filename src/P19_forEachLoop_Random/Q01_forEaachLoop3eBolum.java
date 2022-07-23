package P19_forEachLoop_Random;

import java.util.ArrayList;
import java.util.List;

public class Q01_forEaachLoop3eBolum {
    public static void main(String[] args) {
        // Arraydeki tum elemanlari inceleyip 3 e bolunebilenleri liste atip yazdiralim.

        int[] sayilarr={3,6,9,12,33,23,45,56,43};
        List<Integer> mijnList=new ArrayList<>();

        for (int eachh:sayilarr
             ) {
            if (eachh%3==0){
                mijnList.add(eachh);
            }

        }
        System.out.println(mijnList);


    }
}
