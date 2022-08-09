package P25_oopTekrari_AccesModifier_Encapsulation;

import static P25_oopTekrari_AccesModifier_Encapsulation.Q02_Default.defaultMethod;
import static P25_oopTekrari_AccesModifier_Encapsulation.Q02_Default.defaultVariable;

public class Q01_Private {


    /*
    &&&&&   1- PRIVATE   &&&&&&
    Burada private method veya vaiable a erisim saedce icinde bulundugu classdan oldugunu goruyoruz.
    */

    private static String privateVariable;
    String adim="SELCuk";
    private static void privateMethod(){
        int yasim=37;
        System.out.println(yasim);

    }

    public static void main(String[] args) {
        privateVariable="Merhaba Dunya";

        System.out.println(privateVariable.length());

        privateMethod();
        method1();

        defaultVariable="Nasilsiniz?"; //Ayni package in icindeki farkli classdan Default vaiable veya default method cagirilabilir.
        defaultMethod();

    }
    public static void method1(){

        System.out.println(privateVariable);
    }

    public void method3(){

        privateVariable.length();
    }
}
