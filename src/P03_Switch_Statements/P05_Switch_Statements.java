package P03_Switch_Statements;

import java.util.Scanner;

public class P05_Switch_Statements {
    // Soru 4-) Kullanicidan SDET harflerinin birini yazmasini isteyin
    //Kullanici S gierese "Software"
    //E girerse Engineer
    //D gierese developer
    // T girerse testing yazidirin

    public static void main(String[] args) {
        System.out.println("Lutfen S, D, E, T harflerinden birini giriniz ");
        Scanner scan=new Scanner(System.in);
        char harf =scan.next().toUpperCase().charAt(0);

        switch (harf){
            case  'S' : System.out.println("Software"); break;
            case  'D' : System.out.println("Developer");break;
            case  'E' : System.out.println("Engineer");break;
            case  'T' : System.out.println("Testing");break;
            default:
                System.out.println("Lutfen gecerli harf giriniz");
        }

    }


}
