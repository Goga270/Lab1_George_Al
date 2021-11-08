package lab6;

import java.util.Arrays;

public class Student implements Comparable<Student> {

    public int[] idNumber;
    private int grade;

    public Student(int grade){
        this.grade = grade;
    }
    public Student() {
        idNumber = new int[6];
        idNumber[0] = 20;
        idNumber[1] = 12;
        idNumber[2] = 15;
        idNumber[3] = 18;
        idNumber[4] = 30;
        idNumber[5] = 100;
    }

    public void selectionSort() {
        for (int i = 0; i < idNumber.length; i++) {
            int min = idNumber[i];
            int min_i = i;
            for (int j = i + 1; j < idNumber.length - 1; j++)
                if (idNumber[j] < min) {
                    min = idNumber[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = idNumber[i];
                idNumber[i] = idNumber[min_i];
                idNumber[min_i] = tmp;
            }
        }
    }

    public void PrintScr() {
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }

    public void setIdNumber(int[] idNumber) {
        this.idNumber = idNumber;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int[] getIdNumber() {
        return this.idNumber;
    }

    public int getGrade() {
        return this.grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + Arrays.toString(idNumber) +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (o.getGrade()-this.grade);
    }
}
