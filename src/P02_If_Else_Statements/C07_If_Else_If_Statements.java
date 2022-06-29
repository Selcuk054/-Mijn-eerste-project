package P02_If_Else_Statements;

import java.util.Scanner;

public class C07_If_Else_If_Statements {
    public static void main(String[] args) {
        // 7-) Kullanicidan 100 uzerinden notunu isteyin,
        // Not u harf sistemine cevirip yazdirin.
        // 50'den kucukse D
        //50-60 arasi ise C
        //60-80 arasi ise B
        //80 den buyuk ise A

        System.out.println("Lutfen notunuzu giriniz");
        Scanner scan=new Scanner(System.in);
        Double not=scan.nextDouble();
        if ((not<0) || (not>100)){
            System.out.println("Gecerli bir not giriniz");
        } else if (not<50){
            System.out.println("D");
        } else if (not<60){
            System.out.println("C");
        } else if (not<80){
            System.out.println("B");
        }else {
            System.out.println("A");

            }
        }

    }

