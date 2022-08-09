package P21_Vragen;

public class QStudentProfile_Runner {
    public static void main(String[] args) {
        QStudentProfile profilOne = new QStudentProfile("Ahmet","Yilmaz","Film",4.75, 2022);
        QStudentProfile profileTwo= new QStudentProfile("Ufuk","Kardes","Engineer",4.50,2023);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGradiate);
    }
}
