package P04_String_Manipulation;

public class C07_length {
    public static void main(String[] args) {
        // length verilen String'deki karakter sayisini dondurur.

        String makale="Slagharen is a village in the municipality of Hardenberg in the province of Overijssel, Netherlands. " +
                "\n The village started as a peat excavation village. It is known for the Attractiepark Slagharen, an " +
                "amusement park.";
        System.out.println(makale.length()); //216

        String bosluk= "";
        System.out.println(bosluk.length()); // 0

        String yokluk= null;
        System.out.println(yokluk.length());//  null pointer hatasi verir.
                                             // Yani bosluk varable ina hicbir deger atanmadigini belirtir.


    }
}
