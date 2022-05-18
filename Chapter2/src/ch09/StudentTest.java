package ch09;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student(777, "Lee");
        studentLee.setKoreaSubject("Korea", 100);
        studentLee.setMathSubject("Math", 99);

        Student studentKing = new Student(777, "King");
        studentKing.setKoreaSubject("Korea", 98);
        studentKing.setMathSubject("Math", 97);

        studentLee.showScoreInfo();
        studentKing.showScoreInfo();
    }
}
