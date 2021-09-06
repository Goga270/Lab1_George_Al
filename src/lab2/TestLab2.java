package lab2;
import java.lang.*;
import java.util.Scanner;

public class TestLab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Author a1 = new Author(in.nextLine(),in.nextLine(),in.next().charAt(0));
        System.out.println(a1.ToString());
    }
}
