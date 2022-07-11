package P13_Scope;

public class Q02_staticVariables {
    int statiknummer=10; // bunu class levelda static methodlar icinde
    // kullanabilmek icin static olarak yapmamiz gerekir
    static int statikSayi=12;
    String naam="Oefoek";
    static int DegersizStatic;
    int degersizInstanceVariable;


    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa objeler icin degil class icin gecerlidir.
         */

        System.out.println(statikSayi); //12
        //bu deger class levelda basina static yazarak
        // olusturuldugu icin static methodlar icinde
       // kullanlabilir hale geldi ve bu degerimiz bir static deger oldu

        staticMethod(); //12 //satic methoddaki sout n icindeki yyazdirmak icin buraya tasiyor.
        statikSayi=23;
        System.out.println(statikSayi);//23

        Q02_staticVariables obje1=new Q02_staticVariables(); //obje1 e birsey atayacagimi belirtip alt satirda
        // obje 1 ile static olmayan methodu cagiriyoruz.
        obje1.staticOlmayanMethod();//23
        System.out.println(statikSayi); //23 --> 43 //Static olmayan methodun icindeki atamayi baz alip degistirdi.
        /*
        instance bir variable in degerini bulmak icin objenin olusturulmasindan
        itibaren istenen satire kadar kodu takip etmeliyiz.
        Static variableda ise class in en basindan baslayarak istenen satira kadar kodu takip edip
        tatic variable in sondegerini bulmamiz gerekir.
         */

    }
    public static void staticMethod(){
        System.out.println(statikSayi); // Bu yazdirmalari cagirmadigimiz icin yazdirmaz.
        //Farkli methodlar static variable in hangi degerini bilmek istiyorsak
        //class in basindan itibaren kodun calismasini takib etmeliyiz
        //method nezaman cagirilirsa o anki static variable degerini methodda kullanabiliriz.


    }

    public void staticOlmayanMethod(){
        System.out.println(statikSayi);
        /*
        static variable lar class icerisinden heryerde ulasilabilir.
        static olsun yada olmasin tum method'lar static variable lari
        gorebilir ve degistirebilirler
        Farkli methodlarda staic variable in hangi degeini alacagini bilmek istiyorsak, Class in
        basindan itibaren kodun calismasini takip etmeliyiz.
        Method ne zaman cagrilirsa o anki static variable degerini methodda kullanabiliriz
         */
        statikSayi=43;


    }

}
