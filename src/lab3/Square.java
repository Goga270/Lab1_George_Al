package lab3;

public class Square extends Rectangular{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public  Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
    @Override
    public String toString(){
        return ("Сторона квадрата side:" + this.width + " цвет квадрата - " + this.color + " filled is " + this.filled);
    }
}
