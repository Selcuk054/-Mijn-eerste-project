package P05_StringManipulation;

import java.util.Scanner;

public class C08_Vraag_6sifre {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmasini isteyin. Asagidaki sartlari sagliyorsa
        //Sifre basari ile tamamlandi
        //sartlari saglamazsa lutfen yeni bir sifre giriniz yazdirin
     /*
     -ilkhar buyuk olmali
     -sonharf kucuk olmali
     -sifre bosluk icermemeli
     -sifre uzunlugu en az 8 karakter olmali.
      */
        System.out.println("Lutfen bir sifre giriniz");
        Scanner scan=new Scanner(System.in);
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);
        int uzunluk=sifre.length();
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (uzunluk<8){
            System.out.println("Lutfen yeni bir sifre giriniz");
        } else if ((ilkHarf <= 'Z' && ilkHarf >='A') && (sonHarf <='z' && sonHarf>='a' && !sifre.contains(" ")))  {
            System.out.println("Sifre basari ile tamamlandi");

        }else {
            System.out.println("Islem basarisiz, Lutfen yeni bir sifre deneyiniz");
        }


    }
}
