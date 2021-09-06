package lab1;
import java.lang.*;

public class Ball {
    private String name;
    private int size;
    private int weight;

    public Ball(String n, int size, int weight){
        this.name = n;
        this.size = size;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public  int getSize(){
        return this.size;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSize(int size){
        this.size = size;
    }
     public void setWeight(int weight){
        this.weight = weight;
     }
    @Override
    public String toString(){
        return ("The " + this.name + " football ball, ball's size is " + this.size + " and weight is " + this.weight + "g");
    }
}
