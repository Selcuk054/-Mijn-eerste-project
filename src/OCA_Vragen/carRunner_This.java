package OCA_Vragen;

public class carRunner_This {
    public static void main(String[] args) {
        car_This car1=new car_This();
        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2023;

        System.out.println(" Marka :"+car1.marka+
                ", Model :"+car1.model+
                ", Yil :"+car1.yil);
        //Marka :Toyota,
        // Model :Corolla,
        // Yil :2023

        car_This car2=new car_This("Opel","Corsa");
        System.out.println(" Marka :"+car2.marka+
                ", Model :"+car2.model);

         car_This car3=new car_This("Tofas","Sahin");
        System.out.println(" Marka :"+car3.marka+
                ", Model :"+car3.model);

        car_This car4=new car_This("Nissan","Micra",2022);
        System.out.println(" Marka :"+car4.marka+
                ", Model :"+car4.model+
                ", Yil :"+car4.yil);

        car_This car5=new car_This("Ford","Focus",2003);
        System.out.println(" Marka :"+car5.marka+
                ", Model :"+car5.model+
                ", Yil :"+car5.yil);



    }
}
