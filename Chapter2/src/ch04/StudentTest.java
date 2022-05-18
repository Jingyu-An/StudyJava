package ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "Montreal";

        studentLee.showStudentInfo();

        Student studentKim = new Student();

        studentKim.studentId = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "Ottawa";

        studentKim.showStudentInfo();
    }
}
