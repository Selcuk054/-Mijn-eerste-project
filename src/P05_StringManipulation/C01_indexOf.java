package P05_StringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        //De Nederland is hele mooie land omdat ergens groen is.
        String str="De Nederland is hele mooie land omdat ergens groen is.";

        System.out.println(str.indexOf('s')); // 14
        System.out.println(str.indexOf("d"));  //5
        System.out.println(str.indexOf("de")); // 5
        System.out.println(str.indexOf('k'));

        //Ustteki cumlede simdide bir yerden itibaren arastirmayi ogrenelim.

        System.out.println(str.indexOf("d",5)); // soldan saga ilk karsilastigi aldi ve ondan sonra saymaya basladi
                                                              // 0 dn basladi ve 5 e geldiginde buldu  yani:5
        System.out.println(str.indexOf("o",22)); //22. den baslayip sayinca 22. de o buldu. "tesaduf" :)

        System.out.println(str.indexOf("dat",23)); // birkac kelimeli kalipta ise bunu yapmadigini gorduk.

        // Simdide str'da harflerin 2. yada 3. kez olup olmadigini ogrenip varsa kacinci oldugunu yazdiralim.

        int ilko=str.indexOf("o");
        int ikincio=str.indexOf("o",ilko+1);
        System.out.println(ikincio);


        System.out.println(str.indexOf("o",(ilko+1)));

    }
}
