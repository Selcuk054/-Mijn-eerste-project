package P14_Arrays;

public class Q01_localVariables {
    public static void main(String[] args) {
        int num=10;
        //System.out.println(numMethod); //numMethod method1 de olusturulmus local variable dir.

        for (int i = 0; i <20; i++) {

            System.out.println(i);
        }
       // System.out.println(i); // i loop da olusturulmus local variable dir
        //sadece loop icerisinide kullanilabilir.

      //  static int sayiStatic=30; //static modifier sadece class levelda olusturulabilir
                                //Methodlarin icinde static variable tanimlanamaz.

    }

    public static void method1(){
       // System.out.println(num);  num main method da olusturulmus local bir variable dir
        //ve  sadece main methodda gecerlidir.

        int numMethod=20;

    }
}
