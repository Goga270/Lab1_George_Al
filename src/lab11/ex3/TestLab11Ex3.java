package lab11.ex3;

import java.util.Scanner;

public class TestLab11Ex3 {
    public static void main(String[] args){
        System.out.println(
                new Substract(
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        ),
                        new Const(3)
                ).evaluate(5)
        );
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();

        System.out.println(
                new Add(
                        new Substract(
                                new Variable("x",2),
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")
                                )
                        ),
                        new Const(1)
                ).evaluate(v)
        );
    }
}
