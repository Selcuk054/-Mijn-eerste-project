package P12_doWhileLoop;

public class Q01_yedininKati {
    public static void main(String[] args) {
        //9 dan 190 a kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
        int input1=9;
        int input2=190;
        int temp=input1;
        do {
            if (temp%7==0){
                System.out.println(temp+ " ");
            }
            temp++;
        }while(temp<input2);
    }
}
