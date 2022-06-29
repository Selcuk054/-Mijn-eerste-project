package P05_StringManipulation;

import java.util.Scanner;

public class C06_Vraag_5 {
    public static void main(String[] args) {
        //Kullanicidan 4 harfli bir kelime isteyin ve girilen tersten yazdirin.
        System.out.println("lutfen bir isim giriniz");
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();

        String isim1=isim.substring(3)+
                     isim.substring(2,3)+
                     isim.substring(1,2)+
                     isim.substring(0,1);


        System.out.println(isim1);



    }
}
