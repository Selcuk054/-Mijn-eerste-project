package P25_oopTekrari_AccesModifier_Encapsulation;

public class Q02_Default {

    /*   &&&&&&  2- Default    &&&&&&&
        Default method yada variable lara ayni classin icinden ve ayni package in icinden ulasilabilir.
     */

    static String defaultVariable;
    String sehir="Sakarya";


    static void defaultMethod(){
        defaultVariable="1";

    }
    public static void main (String[] args){
        defaultMethod();

    }

    public static void method1(){
        defaultMethod();


    }

    public void method2(){
        defaultMethod();

    }


}
