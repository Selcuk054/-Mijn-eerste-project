package P07_Forloop;

public class Q07_ForloopTerstenyazdir {
    public static void main(String[] args) {
        String input="Ik ga naar winkelen" ;
        terstengetir(input);
    }
    public static void terstengetir(String input) {
        String tersteninput=" ";
        for (int i = 0; i <input.length() ; i++) {
            tersteninput+=input.substring(input.length()-1-i,input.length()-i);
            //Burda length -1 degeri substring(4,5) atamasinda bir harfi secme mantigiyla yapiliyor.
        } System.out.println(tersteninput);
    }

}
