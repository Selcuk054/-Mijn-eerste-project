package P08_ForLoop;

import java.util.Scanner;

public class P04_ForLoop_Palindrome {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin. Girilen string palindrome (tersten yazildigidada ayni)
        //olup olmadigini kontrol eden bir program yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str=scan.nextLine();

        String str1=str.substring(str.length()-1);

        for (int i = str.length()-2; i >=0; i--) {
            str1+=str.substring(i,i+1);
        }
        System.out.println(str1);
        if (str.equals(str1)){  //== ile denediginde calismadi!

            System.out.println("Bu String bir palindrome dur");
        }else{
            System.out.println("Bu String bir palindrome degildir");
        }
    }

}
