package P06_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        terstenYazdir("ufuk");

    }

    public static void terstenYazdir(String input) {
        String tersInput= input.toUpperCase().substring((3))+
                input.toUpperCase().substring(2,3)+
                input.toUpperCase().substring(1,2)+
                input.toUpperCase().substring(0,1);
        System.out.println("Verilen keliemenin tersten yazilisi :"+tersInput);


    }
}
