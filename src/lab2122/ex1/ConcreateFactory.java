package lab2122.ex1;

public class ConcreateFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex(){
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image){
        return new Complex(real,image);
    }
    
}
