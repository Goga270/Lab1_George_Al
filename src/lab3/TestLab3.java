package lab3;
import java.lang.*;
import java.util.Scanner;

public class TestLab3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Shape s1 = new Circle(in.nextLine(),in.nextBoolean(),in.nextDouble());
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        Shape s2 = new Rectangular(1.0,1.5);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        Scanner in2 = new Scanner(System.in);
        Shape s3 = new Square(3.0,in2.nextLine(),in2.nextBoolean());
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        Movable move = new MovablePoint(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println(move);
        move.moveLeft();
        move.moveUp();
        System.out.println(move);
        Movable moveCircle = new MovableCircle(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println(moveCircle);
        moveCircle.moveUp();
        moveCircle.moveRight();
        System.out.println(moveCircle);
    }
}
