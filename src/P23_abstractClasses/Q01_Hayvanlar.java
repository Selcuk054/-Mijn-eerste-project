package P23_abstractClasses;

public abstract class Q01_Hayvanlar {


    public void ademen(){          //govdeli methodlarimiz
        System.out.println("Hayvanlar nefes alir");
    }
    public void bewegen(){
        System.out.println("Hayvanlar hareket ederler");
    }
    abstract void voeden(); //bunlar abstract methodlarimiz /soyut methodlar
    abstract void poepen();




}
