package OCA_Vragen;

public class ConstructorCall {
    /*
    Bir constructorin baska bir constructor icerisinden cagirmasidir.
    Constructorin icerisinde baska bir constructor varsa muhakkak ilk satirda olmali.

     */
    int x=10, y;
    ConstructorCall() {
        System.out.print(x * y);
    }
    ConstructorCall(int x, int y){
        this();
        this.x=x;
        this.y=10;
        System.out.print(x*y);
    }
    ConstructorCall(int x, int y, int z){
        this(y,z);
        this.x=x;
        this.y=y;
        System.out.print(x*z);
    }
    public static void main(String[] args){
        ConstructorCall dnm=new ConstructorCall(3,4,5);
        System.out.print(dnm.x * dnm.y);
    }
}
