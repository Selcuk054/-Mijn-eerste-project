package P26_Replit_Vragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class V01 {

    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

         Array elemanları: siyah,sari,mavi,turuncu
         */

        List<String> listem=new ArrayList<>();
        listem.add("siyah");
        listem.add("sari");
        listem.add("mavi");
        listem.add("turuncu");

        System.out.println(listem);

        String arr[]= listem.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        String str=arr.toString();
        System.out.println(str);

        List<String> listem1=new ArrayList<>();
        listem.add("siyah");
        listem.add("sari");
        listem.add("mavi");
        listem.add("turuncu");

        System.out.println(listem);

        String arr1[]= listem.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        String str1=arr.toString();
        System.out.println(str);List<String> listem2=new ArrayList<>();
        listem.add("siyah");
        listem.add("sari");
        listem.add("mavi");
        listem.add("turuncu");

        System.out.println(listem);

        String arr2[]= listem.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        String str2=arr.toString();
        System.out.println(str);List<String> listem3=new ArrayList<>();
        listem.add("siyah");
        listem.add("sari");
        listem.add("mavi");
        listem.add("turuncu");

        System.out.println(listem);

        String arr3[]= listem.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        String str3=arr.toString();
        System.out.println(str);


    }
}
