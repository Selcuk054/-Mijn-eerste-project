package P25_oopTekrari_AccesModifier_Encapsulation;

public class Q05_Encapsulation {

    /*  &&&&&&&   ENCAPSULATION  &&&&&&&
    Encapsulation onemli verilerisaklama yontemi olarak kullanilir. Kapsulleme olarak ifade edilir.
    Encapsule edilen variable ve methodlara izin veridginiz kisiler ulasabilir ama degistiremez/.

    Encapsulation iki sekilde yapilir.
    1- Class uyelerini (Variable, method) private yapmalisiniz.
    2- public olan getter() ve setter() methodlar uretmelisiniz.




     */
    private String isim="Veli";
    private int tcNo=8463764;

    public static void main(String[] args) {

        Q05_Encapsulation obje1=new Q05_Encapsulation();
        obje1.isim="Selami";
        obje1.tcNo=637282;
        System.out.println(obje1.isim +"  "+ obje1.tcNo);


        System.out.println();


    }
    //  &&&& Getter- Setter Methodlari  (JAVA BEANS)  &&&&&

    public void setTcNo(int tcNo){
        this.tcNo=tcNo;

    }





    }

