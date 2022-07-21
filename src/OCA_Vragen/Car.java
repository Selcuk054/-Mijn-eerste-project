package OCA_Vragen;

public class Car {

    public Car(){
        System.out.println("Parametresiz Constructor");
    }
    public Car(String renk){
        System.out.println(renk+" araba uretildi");

}
    public Car(int yil){
        System.out.println(yil + " model araba uretildi");
    }

    public Car(int yil, String renk){
        System.out.println(yil + " model "+renk+" renginde bir araba uretildi");
    }
}