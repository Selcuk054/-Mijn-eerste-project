package P20_StrinBuilder_Buffer;

public class Q01_appendInsertDelete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Merhaba");

        sb.append(" Avrupa");// StringBuilder in sonuna ekliyor
        System.out.println(sb); //Merhaba Avrupa

        sb.delete(8,14);
        System.out.println(sb);//Merhaba

        sb.insert(8,"Dunya"); //*. indexten sonraya Dunya ekliyor
        System.out.println(sb); //Merhaba Dunya
    }
}
