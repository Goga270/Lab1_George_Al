package lab3;

public class Circle extends Shape{
    protected double radius;
    @Override
    public double getArea(){
        double res = pi*radius*radius;
        return res;
    }

    @Override
    public double getPerimeter(){
        double res = 2*pi*radius;
        return res;
    }

    @Override
    public String toString(){
        return ("Color of Circle is " + this.color + " , radius is " + this.radius + " and filled is " + this.filled );
    }

    public Circle(){
        super();
    }
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
