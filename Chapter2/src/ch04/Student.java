package ch04;

public class Student {

    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println("Student Id : " + studentId + ", Name : " + studentName + ", Address : " + address);
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}
