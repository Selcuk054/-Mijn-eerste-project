package P13_Scope;

public class Q01_instanceVariables {
       /*
       Class icerisinde heryerden kullanmak istedigimiz variable da class levelda(Class larin icinde fakat methodlarin disinda)
       Genellikle class variable lar class in basinda olusturulur fakat sart degildir.

      Class leveldaki variable lar icin iki scope vardir demistik &&
      1- Staic variables
      2- instance variable (static olmayan) variables (obje variable i da denir)

       Class level demek class seviyesinde anlamina geliyor

       */

    int instanceSayi=20; //static olmayip class levelda oldugu icin instance variable'dir.


    public static void main(String[] args) {
        int nummer=34;

       // System.out.println(instanceSayi);
        /*
        Instance variable static klube uye olmadigi icin direkt cagiramayiz, kullanamayiz.
        instance variable larin diger adi object variable dir.
        dolayisiyla obje olusturursak instance variable'lari heryerden kullanabiliriz.

         */

        Q01_instanceVariables obje1 = new Q01_instanceVariables();
        System.out.println("Obje1 degismeden once :"+obje1.instanceSayi);// 20
        obje1.instanceSayi=30;
        System.out.println("Obje1 degistikten sonra :"+obje1.instanceSayi);//30

        Q01_instanceVariables obje2=new Q01_instanceVariables();
        System.out.println("obje2 degismeden once :"+obje2.instanceSayi); //obje 2 olark cagirdigimizda tekrar instance variable i yukaridan getirir.
        obje2.instanceSayi=26;
        System.out.println("obje 2 degistikten sonra :"+ obje2.instanceSayi); //26

        Q01_instanceVariables oobje3=new Q01_instanceVariables();
        System.out.println("obje3 degismeden once :"+oobje3.instanceSayi); //20

        /*
        Her obje olustugunda insatnce (obje) vaiable inin ilk atanan degerini alir.
         */



    }
    public static void staticMethod(){

// Static yazmak yada yazmamak method olusturmak icin zorunlu degil, fakat bunu yazmanin amaci
        //diger static methodlarla irtibatlandirmak.

       // System.out.println(nummer);

        /*
bir methodun icersinde olusturulan variable, sadece o methodun icinden kullanlabilir.
Buna (Local variable diyecegiz ileride)
         */
        /*
        instanceSayi=30;
        Instance variable lara main method disindaki static methodlardan da direct uasamayiz,
        ama obje olusturursak ulasabiliriz.
        */
        Q01_instanceVariables obje4= new Q01_instanceVariables();
        System.out.println(obje4.instanceSayi);

    }
    public void staticOlmayanMethod(){
        System.out.println(instanceSayi);
        /*
        instance variable lar class icerisindeki static olmayan methodlardan direct kullanilabilir.
         */

    }

}
