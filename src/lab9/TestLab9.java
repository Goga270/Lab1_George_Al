package lab9;

import java.util.Scanner;

public class TestLab9 {
    LabClass labClass;

    public TestLab9() {
        labClass = new LabClass();
        LabClassDriver labDriver = new LabClassDriver(labClass);
        labDriver.input();
    }

    public void searchStudent() {
        String nameStudent = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of search Student: ");
        try {
            nameStudent = in.next();
            if (nameStudent.isEmpty())
                throw new EmptyStringExeption("String is Empty!");
        } catch (EmptyStringExeption elem) {
            System.out.println(elem.getMessage());
            searchStudent();
        }
        try {
            System.out.println(labClass.search(nameStudent).toString());
        } catch (StudentNotFoundExeption elem) {
            System.out.println(elem.getMessage());
        }
    }

    public static void main(String[] args) {
        TestLab9 start = new TestLab9();
        start.searchStudent();
    }
}