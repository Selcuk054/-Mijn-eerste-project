package P10_NestedForLoop;

public class C01_forLoop {
    //Verilen stringdeki kullanilan harfleri tekrarsiz olarak yazdirip
    //kelimede kullanilan farkli harf sayisini veren bir methode yaziniz

    public static void main(String[] args) {

        String input="Merhabalar";
        tekrarsizYap(input);



    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W","");
        System.out.print(islenecekKelime.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }

        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : "+benzersizInput);
    }
}
