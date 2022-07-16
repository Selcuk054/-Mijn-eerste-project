package P16_Vragen2;

public class Q01_degerToplami {
    /*
    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
    Test Data
    34
    Beklenen Çıkti  7

     */
    public static void main(String[] args) {
        int birlerb=0;
        int rakamlarTop=0;
        int input=453654646;

        while(input>0){
          birlerb=input%10;
          rakamlarTop+=birlerb;
         input/=10;

        }System.out.println(rakamlarTop);
    }
}
