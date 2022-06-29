package P04_String_Manipulation;

public class C05_equals {
    public static void main(String[] args) {
        String name="Ufuk 09";
        String name1=name+"";
        System.out.println(name==name1); // == karsilastirma operatoru verilen iki String objesinin degerinin yaninda
        // referance (adres) lerine de bakar
        System.out.println(name.equals(name1))// equals metodu verilen iki String in iceriginin birbirine
        // esit olup olmadigini kontrol eder.
        ;
    }
}
