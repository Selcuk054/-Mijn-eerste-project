package P20_StrinBuilder_Buffer;

public class Q02_substring {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Portakal");

        sb.substring(3);// Bu yaptigimiz islemi consolda gorebilmemiz icin. Soutun icinde bunu yazmaliyiz.

        System.out.println(sb); //Portakal

        System.out.println(sb.substring(3));//takal
    }
}
