package P02_If_Else_Statements;

import java.util.Scanner;

public class C03_If_Else_Statements {
    public static void main(String[] args) {
        //Kullaniciya yasini sorun eger yas 65'den kucukse emekli olamazsin, calismalisin,
        // 65'e esit veya buyukse "emekli olabilirsin" yazdirin.

        System.out.println("Schrijf uw geboorte datum aub");
        Scanner scan=new Scanner(System.in);
        byte jaar=scan.nextByte();

        if (jaar<65) {
            System.out.println("U kunt geen pension worden, u moet werken");
        } else {
            System.out.println("U kunt pension worden");
        }


    }
}
