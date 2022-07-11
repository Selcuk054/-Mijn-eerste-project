package P13_Scope;

public class Q03_classVariables {
    public static void main(String[] args) {
        /*
        Farkli bir class da calisirken herhngi bir class adini yazip noktaya basarsak
        adini yazdigimiz class daki tum static class uyelerini gorebilir ve kullanabiliriz.

         */
        Q02_staticVariables.staticMethod(); // tum class i degil classtaki bu methodu calistirir. ve ordaki degeri yazdirir.
                                            //Class in icinde yapilan degisikliklere bakmaz ve ordaki degere class icinde atanan ilk degeri alir. //12

        System.out.println(Q02_staticVariables.statikSayi); //Bu class daki ilk static sayi degerine gider onun icinde baska atana degerleri umursamaz. //12

        System.out.println(Q02_staticVariables.DegersizStatic);//Yine bu class a gidip buradaki Degersiz staticte ki degere bakar deger ne ise onu yazdirir
                                                                //eger deger yok ise ilgili degeri girer --> 0
        // YANI DEFAULT DEGER ATAMASI YAPAR
        //       int --> 0
        //       String --> null
        //       boolean --> false
        //       char --> (hiclik yani hicbirsey)


        /*
        baska Class daki instnce variable lara obje olusturarark ulasabiliriz. (static olmadigi icin direkt alamiyoruz)
         */

        Q02_staticVariables obje1=new Q02_staticVariables(); //Obje deyip nokta biraktigimda static metodlara yada static variable lara ulasilamaz
        //obje ile burada static olmayan methodlara ve variable lara, degersiz instance variable.... ulasabiliyoruz .

        obje1.staticOlmayanMethod();//Burada da class a gider static olmayan methoddan ne yazdirilacagina bakar ve icindeki degerin ilk atanan degerini alir.
                                     //12
        // ve bu method icinde ki static sayi degerine 43 degerini atar. yani class daki islemi yapar.

        System.out.println(obje1.naam);// Oefoek
        System.out.println(obje1.degersizInstanceVariable); //0

        System.out.println(Q02_staticVariables.statikSayi);//Ustte cagirdigimiz static olmayan methoda o
                                                           // class icinde 43 degeri atanmisti burda o degeri yazdirir.

        /*
        Farkli bir class dan Q02 clasindan method ve variable lari kullandigimda Q02 Class inin tamami degil sadece
        benim cagirdigim class uyeleri calisir.
         */


    }
}
