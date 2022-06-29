package P02_If_Else_Statements;

import java.util.Scanner;

public class C02_If_Else_Statements {
    public static void main(String[] args) {
        /* 2-) kullanicindan bir karakter girmesini isteyin ve
        girilen karakterin harf olup olmadigini yazdirin.
         */
        System.out.println("Lutfen bir karakter giriniz");
        Scanner scan=new Scanner(System.in);
      char s1=scan.next().charAt(0);

        if ((s1>='a'&& s1<='z') || (s1>='A' && s1<='Z')){
            System.out.println("HARF");
        } else {
            System.out.println("HARF DEGILDIR");
        }
    }
}
