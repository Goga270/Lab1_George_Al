package lab9;

import java.util.Scanner;

public class LabClassDriver {
    LabClass labClass;
    Scanner in = new Scanner(System.in);

    public LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void input() {
        String nameStudent;
        int num;
        System.out.println("Name Student (0 - End) - ");
        nameStudent = in.next();
        while (!nameStudent.equals("0")) {
            num = in.nextInt();
            labClass.addStudent(new Student(nameStudent, num));
            nameStudent = in.next();
        }
    }
}
