package P21_Vragen;

import java.util.Scanner;

public class New_soru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number1==number2){
            System.out.println(number1 +" == "+number2);

        }else if(number1>number2){
            System.out.println((number1 +" != "+ number2) +"\n"+ (number1 +" > "+number2) +"\n"+ (number1 +" >= "+number2));
        }else {
            System.out.println((number1 +" != "+ number2) +"\n"+ (number1 +" < "+number2) +"\n"+ (number1 +" <= "+number2));
        }
    }
}
