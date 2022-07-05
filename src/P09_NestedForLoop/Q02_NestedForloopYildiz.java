package P09_NestedForLoop;

import java.util.Scanner;

public class Q02_NestedForloopYildiz {
    public static void main(String[] args) {

        //Kullanicidan pozotof bir rakam girmesini isteyin ve girilen rakama gore asagidaki
        //sekli cizdirin.
        //*
        //**
        //***
        //****
        //*****

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");


        }
    }
}
