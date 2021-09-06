package lab1;
import java.lang.*;
import java.util.Scanner;

public class TestLab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ball b1 = new Ball(in.nextLine(),in.nextInt(),in.nextInt());
        System.out.println(b1);
        Scanner in2 = new Scanner(System.in);
        Book b2 = new Book(in2.nextLine(),in2.nextInt());
        System.out.println(b2);
    }
}
