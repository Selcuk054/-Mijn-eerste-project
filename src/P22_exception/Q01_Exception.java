package P22_exception;

public class Q01_Exception {
    public static void main(String[] args) {
        int sayi1=100;
        int sayi2=0;

        try {
            System.out.println(sayi1/sayi2);
       } catch (ArithmeticException e) {
            e.printStackTrace(); //Hatayi buldu ne oldugunu gosteriyor ama devam ediyor islemimiz.
        }
    }
}
