package P05_StringManipulation;

import java.sql.SQLOutput;

public class C02_Vraag_1 {
    public static void main(String[] args) {
        //String metodlarini kullanarak "Java ogrenmek 123 Cok guzel " Stringini
        //" Java ogrenmek cok guzel " sekline getirin.

        String str="Java ogrenmek123 Cok guzel@";
        str=str.replaceAll("\\d","");
        System.out.println(str.replaceAll("\\d",""));
        str=str.replace("@","");

        str=str.toLowerCase();
        System.out.println(str.replace('j','J'));



    }
}
