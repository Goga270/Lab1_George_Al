package lab3;

public class Rectangular extends Shape{
    protected double width;
    protected double length;
    
    public Rectangular(){
        super();
    }
    public Rectangular(double width,double length){
        this.length = length;
        this.width = width;
    }
    public Rectangular(double width,double length, String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        double res = width*length;
        return res;
    }
    @Override
    public  double getPerimeter(){
        double res = 2*(width+length);
        return res;
    }
    @Override
    public  String toString(){
        return ("Color of Rectangular is " + this.color + " width is " + this.width + " length is " + this.length + " and filled is " + this.filled);
    }

}
