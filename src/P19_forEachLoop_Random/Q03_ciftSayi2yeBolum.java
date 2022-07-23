package P19_forEachLoop_Random;

import java.util.ArrayList;
import java.util.List;

public class Q03_ciftSayi2yeBolum {
    public static void main(String[] args) {
        //Arraydeki cift sayilari bulun ve bunlari 2ye bolup listte yazdirin

        int [] num1={23,44,55,66,78,67,6,544,34,56,776};
        List<Integer> listCift=new ArrayList<>();

        for (int each2:num1
             ) {
            if(each2%2==0){
                each2/=2;
                listCift.add(each2);
            }

        }
        System.out.println(listCift);
    }
}
