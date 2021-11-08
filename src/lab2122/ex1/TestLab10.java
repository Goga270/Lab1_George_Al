package lab2122.ex1;

public class TestLab10 {
    public static void main(String[] args){
        Complex c1,c2;
        ConcreateFactory factory = new ConcreateFactory();
        c1 = factory.createComplex();
        c1.Print();
        int real = 10, image = 3;
        c2 = factory.CreateComplex(real,image);
        c2.Print();
    }
}
