package P17_ArrayLists;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q10_Herhalen {

    public static void main(String[] args) {
 //1- add() ile ekleme yapma

        List<String> autos=new ArrayList<>();
    autos.add("Mercedes");
    autos.add("Bugatti");
    autos.add("BMW");
        System.out.println(autos);//[Mercedes, Bugatti, BMW]

        // 2- size() ile boyutu olcme
        System.out.println("List in boyutu :"+autos.size()); //3

        // 3- isEmpty ile Arraylist in bos olup olmadigini dondurur.

        System.out.println(autos.isEmpty()); //false

        //4- remove() ile eleman silme

        autos.remove(0); // 0 nolu indexi sildi.
        System.out.println(autos); //[Bugatti, BMW]

        System.out.println(autos.remove(1)); //BMW sildigini teyit etmek icin sildigi elementi yazdirir.

        System.out.println(autos.remove("Bugattim"));// false yazzdirdi (gittim baktim bulamadim, bu yuzden silemeidim)

        System.out.println(autos.remove("Bugatti")); //true yadirdi (gittim baktim buldum sildim anlaminda)

        autos.add("Ford");
        autos.add("Porsche");
        autos.add("Toyota");
        autos.add("Audi");
        autos.add("Nissan");
        System.out.println(autos); //[Ford, Porsche, Toyota, Audi, Nissan]

        System.out.println(autos.removeAll(autos)); //true hepsini sildim anlaminda
        System.out.println(autos);// []

        //5- set() ile var olan elemani degistirme

        List<Integer> dogumYillari=new ArrayList<>();

        dogumYillari.add(1992);
        dogumYillari.add(1991);
        dogumYillari.add(1999);
        dogumYillari.add(1985);
        System.out.println(dogumYillari);//[1992, 1991, 1999, 1985]

        dogumYillari.set(2,2002);
        dogumYillari.set(0,2012);
        System.out.println(dogumYillari); //[2012, 1991, 2002, 1985]

       // dogumYillari.set(4,2001);// 4 nolu index olmadigi icin IndexOutOfBoundsException hatasini verir.
        System.out.println(dogumYillari);

        //6- get (index) ile istenen indexteki elemani 'get'irir :)

        autos.add("Ford");
        autos.add("Porsche");
        autos.add("Toyota");
        autos.add("Audi");
        autos.add("Nissan");

        autos.get(2); //gorebilmemmiz isin bunu sout icinde calistirmaliyiz
        System.out.println(autos.get(2)); //Toyota

        //7- contains() ile element kontrolu yapma varsa true/ yoksa false

        System.out.println(autos.contains("Ford")); //true
        System.out.println(autos.contains("Jeep")); //false

        //8- Collections.sort() ile kucukten buyuge veya alfabetik siraya gore siralar

        Collections.sort(autos);
        System.out.println(autos); //[Audi, Ford, Nissan, Porsche, Toyota]

        //Array de Array.sort ile yapilan siralama Arraylist te  Collections.sort ile yapiliyor.

        //9- equals() methodu ile iki listteki elemanlarin ayni olup olmadigina bakar boolean doner

        List<String> isimler=new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Ufuk");
        isimler.add("Kemal");

        List<String> Isimler1=new ArrayList<>();
        Isimler1.add("Ahmet");
        Isimler1.add("Mehmet");
        Isimler1.add("Ufuk");
        Isimler1.add("Kemal");

        System.out.println(isimler.equals(Isimler1)); //true
        Isimler1.set(1,"Ismail");
        System.out.println(isimler.equals(Isimler1)); //false

        //10 clear() ile tum elemanlari siler

        System.out.println(isimler.isEmpty());// false
        System.out.println(isimler.size());//4
        isimler.clear(); // burda siler ve hic birsey dondurmez
        System.out.println(isimler); //[]









    }
}
