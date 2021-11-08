package lab6;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TestLab6 {

    public static ArrayList<Student> Merge(ArrayList<Student> A,ArrayList<Student> B){
        ArrayList<Student> C = new ArrayList<Student>();
        Collections.sort(A,Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());
        int a_i=0,b_i=0;
        boolean flag = false;
        Student buffer = null;
        Student a = A.get(0);
        Student b = B.get(0);
        if(a.getGrade()<b.getGrade()){
            C.add(a);
            flag = true;
            a_i++;
        }else {
            C.add(b);
            flag = false;
            b_i++;
        }
        int C_len = A.size() + B.size();
            for(int i = 1;i<C_len;i++) {
                if((flag)&&(a_i<A.size())){
                    a = A.get(a_i);
                    if(a.getGrade()<b.getGrade()){
                        flag = true;
                        C.add(a);
                        a_i++;
                    }else {
                        flag = false;
                        C.add(b);
                        b_i++;
                    }
                }else if ((a_i<A.size())&&(b_i>=B.size())){
                    C.add(a);
                    a_i++;
                    if (a_i<A.size()){
                        a = A.get(a_i);
                    }
                }else if ((!flag)&&(b_i<B.size())){
                    b = B.get(b_i);
                    if (b.getGrade()<a.getGrade()){
                        C.add(b);
                        b_i++;
                        flag = false;
                    }else {
                        C.add(a);
                        a_i++;
                        flag = true;
                    }
                }else if ((b_i<B.size())&&(a_i>=A.size())){
                    C.add(b);
                    b_i++;
                    if(b_i<B.size()){
                        b = B.get(b_i);
                    }
                }
            }
        return C;
    }

    public static void main(String[] args){
        Student st1 =new Student(2);
        Student st2 = new Student(9);
        Student st3 = new Student(7);
        Student[] Students = new Student[]{st1,st2,st3};
        System.out.println(Arrays.toString(Students));
        InsertionSort(Students);
        System.out.println(Arrays.toString(Students));
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(5));
        list.add(new Student(6));
        list.add(new Student(3));
        Collections.sort(list);
        for(Student lt:list){
            System.out.println(lt);
        }
        System.out.println("-------");
        ArrayList<Student> A = new ArrayList<Student>();
        ArrayList<Student> B = new ArrayList<Student>();
        A.add(new Student(5));
        A.add(new Student(3));
        B.add(new Student(1));
        B.add(new Student(10));
        B.add(new Student(7));
        A.add(new Student(123));
        A.add(new Student(0));
        for (Student lt1:A){
            System.out.println(lt1);
        }
        for (Student lt2:B){
            System.out.println(lt2);
        }
        System.out.println("--------------");
        ArrayList<Student> C = Merge(A,B);
        for (Student lt3:C){
            System.out.println(lt3);
        }
    }
    public static void InsertionSort(Student[] idNumber) {
        for (int i = 0; i < idNumber.length - 1; i++) {
            for (int j = i + 1; j < idNumber.length; j ++) {
                if (idNumber[i].getGrade() > idNumber[j].getGrade()) {
                    Student temp = idNumber[i];
                    idNumber[i] = idNumber[j];
                    idNumber[j] = temp;
                }
            }
        }
    }
}
