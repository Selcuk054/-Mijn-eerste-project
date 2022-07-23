package P18_constructorVragen;

public class student {
    String name ="Emily";
    int age=20;

    student(String name, int age) {
        this.name=name;
        this.age=22;
    }
    public static void main(String[] args) {
        student st =new student("Oliver",21);
        System.out.print(st.name);
        System.out.print(", "+st.age); //Oliver, 22

    }

}
