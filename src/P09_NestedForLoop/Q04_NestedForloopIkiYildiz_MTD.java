package P09_NestedForLoop;

public class Q04_NestedForloopIkiYildiz_MTD {
    public static void main(String[] args) {
        int input=10;
        ikiyildizYapma(input);

    }

    public static int ikiyildizYapma(int input) {
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= input; i++) {
            for (int j = input - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        return input;
    }


}
