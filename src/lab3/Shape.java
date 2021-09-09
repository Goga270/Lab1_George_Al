package lab3;

public abstract class Shape {
    public double pi = 3.14;
    protected String color;
    protected boolean filled;
    public Shape(){
        this.filled = false;
        this.color = "default";
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
    @Override
    public abstract String toString();

}
