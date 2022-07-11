package P14_Arrays;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];
        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar));

        sayilar[1]=45;
        sayilar[2]=99;
        sayilar[0]=110;

        System.out.println(Arrays.toString(sayilar));

        String siniflist[]={"John","Michael","Tom"};
        System.out.println(Arrays.toString(siniflist));

        siniflist[2]="Kemal";
        System.out.println(Arrays.toString(siniflist));

    }
}
