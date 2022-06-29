package P04_String_Manipulation;

public class C02_charAt {
    public static void main(String[] args) {

        String kod="Oglum bugun hasta ve okula gidemedi";
        System.out.println(kod.charAt(0)); //index 0 dan baslar ve maximum (String uzunlugu -1) dir.

        //sayet maximum index ten buyuk bir sayi kullanilirsa Java hata verir.

        String sehir="Amsterdam";
        System.out.println(sehir.charAt(8));
    }
}
