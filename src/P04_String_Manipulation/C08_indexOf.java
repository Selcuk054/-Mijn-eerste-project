package P04_String_Manipulation;

public class C08_indexOf {
    public static void main(String[] args) {
        //Verilen String de istenen ilk karakterin kullanildigi ilk index i donudurur.
        String zin= "Vanmiddag gaat mijn taalcursus beginnnen";

        System.out.println(zin.indexOf('b')); // b harfi ilk 31. karakterde gorunmektedir.
        System.out.println(zin.indexOf('V')); // V harfi ilk karakter oldugu icin 0 verir.
        System.out.println(zin.indexOf("k")); // k harfi bulunmadigi icin -1 verir.
        System.out.println(zin.charAt(zin.length()-1)); //son karakterini yazdiralim n

    }
}
