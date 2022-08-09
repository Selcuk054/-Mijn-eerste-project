package P21_Vragen;

public class QStudentProfile {

        String firstName;
        String lastName;
        String decleradMajor;
        double gpa;
        int expectedYearToGradiate;
        public QStudentProfile(String firstName,String lastName, String decleradMajor, double gpa, int expectedYearToGradiate){
            this.firstName=firstName;
            this.lastName=lastName;
            this.decleradMajor=decleradMajor;
            this.gpa=gpa;
            this.expectedYearToGradiate=expectedYearToGradiate;

        }

        public void incrementExpectedGraduationYear(){
            this.expectedYearToGradiate=this.expectedYearToGradiate+1;

        }
    }

