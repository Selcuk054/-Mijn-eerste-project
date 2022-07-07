package P12_doWhileLoop;

public class Q03_harfYazdirma {
    //m harfindan baslayip c harfine kadar tum harfleri yazdirin
    public static void main(String[] args) {
        char ilkHarf='m';
        char sonHarf='c';
        char temp=ilkHarf;

        while (temp>=sonHarf) {
            System.out.println(temp+" ");
            temp-=1;
        }temp++;
    }
}
