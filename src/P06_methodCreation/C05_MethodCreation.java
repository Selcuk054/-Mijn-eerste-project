package P06_methodCreation;

import java.util.Scanner;

public class C05_MethodCreation {
    //Kullanicidan sehir ismini ve dogum tarihini alalim.
    //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun.
    // sehir ismini programimizda buyuk harf olarak
    //tarihi iste 2022=06-30 seklinde kullanmak istiyoruz.

    public static void main(String[] args) {
       String sehir=sehiral();
       String tarih=tarihAl();
        System.out.println("Girdiginiz sehir :"+sehir);
        System.out.println("Girdiginiz tarih :"+tarih);
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Kacinci yil oldugunu giriniz");
        int yil = scan.nextInt();

        if (yil < 1900 || yil > 2200) {
            System.out.println("Lutfen gecerli bir yil giriniz");
        } else {
            tarih = yil + "-";
        }
        System.out.println("Ay giriniz");

        int ay = scan.nextInt();
        if (ay < 0 || ay > 12) {
            System.out.println("Lutfen gecerli bir ay giriniz");
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("Gun giriniz");
        int gun = scan.nextInt();
        if (gun < 0 || gun > 31) {
            System.out.println("Lutfen gecerli bir gun giriniz");
        } else {
            tarih = tarih + ay;
        }
        return tarih;

    }

    public static String sehiral() {
        System.out.println("Lutfen sehir ismi giriniz");
        Scanner scan=new Scanner(System.in);
        String sehiral = scan.nextLine().toUpperCase();

        return sehiral;



    }


}
