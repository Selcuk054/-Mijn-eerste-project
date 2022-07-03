package P07_Forloop;


import java.util.Scanner;

public class Q08_ForloopFaktoriyel {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi =scan.nextInt();
        int sonuc=1;

        if (sayi<0 || sayi>=20){
            System.out.println("Bu sayi hesaplanamaz");
        }else {
            for (int i =1; i <=sayi ; i++) {
                sonuc*=i;
                System.out.println(sonuc);
            }


        }
    }
}
