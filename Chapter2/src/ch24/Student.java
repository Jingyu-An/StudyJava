package ch24;

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;

    ArrayList<Subject> subjectList;

    Student(int studentId, String studentName){

        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {

        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(point);

        subjectList.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;

        for (Subject subject : subjectList) {

            total += subject.getScorePoint();
            System.out.println("Point of " + subject.getName() + " is " + subject.getScorePoint() + ".");
        }

        System.out.println("Name : " + studentName + ", Total Score : " + total);
    }
}
