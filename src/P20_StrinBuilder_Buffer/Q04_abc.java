package P20_StrinBuilder_Buffer;

public class Q04_abc {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        sb1.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb1); //abbaccca
    }

}
