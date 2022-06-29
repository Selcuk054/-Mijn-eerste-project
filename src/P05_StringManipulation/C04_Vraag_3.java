package P05_StringManipulation;

import java.util.Scanner;

public class C04_Vraag_3 {
    public static void main(String[] args) {
        // kullanicidan isim isteyin. Eger
        // - isim a harfi iceriyorsa "Girdiginiz icim a harfi iceriyor"
        // - isim "Z" harfi iceriyorsa  "Girdiginiz icim Z harfi iceriyor"
        // -ikiiside yoksa girdiginiz isim a veya Z harfi icermiyor yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz.");
        String isim=scan.nextLine();

        if (isim.contains("a") && (isim.contains("Z"))){
            System.out.println("Girdiginiz isim a ve Z harfi iceriyor");
        } else if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else if (isim.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }


    }
}
