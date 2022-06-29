package P03_Switch_Statements;

import java.util.Scanner;

public class P01_Switch_Statements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sinif mevudunu ogrenmek icin sinif numarasini giriniz");
        int mevcut=scan.nextInt();

        switch (mevcut){
            case 1 :
                System.out.println("mevcut = 23"); break;
            case 2 :
                System.out.println("mevcut = 65"); break;
            case 3:
                System.out.println("mevcut = 32"); break;
            default:
                System.out.println("digerleri toplam");
        }
    }
}
