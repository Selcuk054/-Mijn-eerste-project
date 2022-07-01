package P06_methodCreation;

public class C03_MethodCreation_GizliIsim {

    //input olarak verilen isim ve soyismi
    // ilk harfi buyuk geriye kalan harfler yildiz olacak sekilde
    // I****** K***** yazdiran method olusturun

    public static void main(String[] args) {
        String isim= "Ufuk";
        String soyisim="Kardes";
        gizli(isim,soyisim);


    }

    public static void gizli(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyisim);


    }
}
