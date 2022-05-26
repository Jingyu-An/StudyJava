package ch24;

public class StudentSubjectTest {

    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("Math", 50);
        studentLee.addSubject("Art", 100);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("Math", 85);
        studentKim.addSubject("Art", 70);
        studentKim.addSubject("English", 100);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
