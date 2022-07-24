package P20_StrinBuilder_Buffer;

public class Q05_100den0aciftler {
    /*100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT : 100 98 96 94 92 … … … … 2 0
 */
    public static void main(String[] args) {

        int sayi=1;
        int ilk=100;

        while(sayi>=0){
            sayi=ilk-2;
        }
        System.out.println(sayi);
    }
}
