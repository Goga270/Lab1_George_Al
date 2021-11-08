package lab9;

public class Student {
    private String nameStudent;
    private int studentINN;

    public Student(String nameStudent, int averageScore) {
        this.nameStudent = nameStudent;
        this.studentINN = studentINN;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getStudentINN() {
        return studentINN;
    }

    public void setStudentINN(int studentINN) {
        this.studentINN = studentINN;
    }

    @Override
    public String toString() {
        return "Name - " + nameStudent + " Score - " + studentINN;
    }
}
