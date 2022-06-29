package P05_StringManipulation;

public class C07_Vraag_6Sifre {
    //Kullanicidan bir sifre girmasini isteyin. Asagidaki sartlari sagliyorsa
    //Sifre basari ile tamamlandi
    //sartlari saglamazsa lutfen yeni bir sifre giriniz yazdirin
     /*
     -ilkhar buyuk olmali
     -sonharf kucuk olmali
     -sifre bosluk icermemeli
     -sifre uzunlugu en az 8 karakter olmali.
      */
    public static void main(String[] args) {

        String sifre ="Javacandır";

        if (sifre.substring(0,1).equals(sifre.toUpperCase().substring(0,1))
                && sifre.substring(sifre.length()-1).equals(sifre.toLowerCase().substring(sifre.length()-1))
                && !sifre.contains(" ")&&sifre.length()>=8){
            System.out.println("şifre doğru");
        }else
            System.out.println("şifre yanlış");




    }
}
