package P11_whileLoop;

public class Q02_tamBolunebilen {
    public static void main(String[] args) {
        //Forloop ve While loop kullanarak 3 basamakli sayilardan
        // 15,20 ve 90 na tam bolunebilen sayilari yazdirin.
        // a = 15   b=20   c=90

        int sayi = 0;

        while (sayi < 1000) {
            for (int i = 100; i <1000; i++) {
                if (i % 15==0 && i%20==0 && i%90==0) {
                    System.out.print(i + " ");
                }
                sayi++;

            }


        }
    }
}
