package lab9;

import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Student> List;
    Student newStudent;

    public LabClass() {
        this.List = new ArrayList<>();
    }

    public void addStudent(Student student) {
        List.add(student);
    }

    public Object search(String nameStudent) throws StudentNotFoundExeption {
        for (Student student : List) {
            if(student.getNameStudent().equals(nameStudent)) {
                newStudent = student;
                return newStudent;
            }
        }
        throw new StudentNotFoundExeption("Student " + nameStudent + " is not found!");
    }

    public boolean isEmpty() {
        return List.isEmpty();
    }
    public Student remove() {
        return List.remove(0);
    }
}
