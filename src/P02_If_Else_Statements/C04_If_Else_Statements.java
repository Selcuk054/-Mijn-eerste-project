package P02_If_Else_Statements;

import java.util.Scanner;

public class C04_If_Else_Statements {
    public static void main(String[] args) {
        // 4-) Kullanicidanbir ucgenin uc kenar uzunlugunu alin eger uzunluklar esit ise
        // ekrana "Eskenar ucgen" yazdirin. Diger durumlarda eskenar degil yazdirin.

        System.out.println("Schrijf u drie aparte nummer in.");
        Scanner scan=new Scanner(System.in);
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();

        if ((num1==num2) && (num1==num3)){
            System.out.println("Eskenar Ucgen");
        } else {
            System.out.println("Eskenar Degildir");
        }
    }
}
