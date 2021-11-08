package lab10.ex1;

public class Complex {
    private
        int real;
        int image;
    public Complex(){
        this.image = 0;
        this.real = 0;
    }

    public Complex(int real,int image){
        this.real = real;
        this.image = image;
    }
    public void Print(){
        System.out.println("Real: " + this.real + "  Image: " + this.image);
    }
}
