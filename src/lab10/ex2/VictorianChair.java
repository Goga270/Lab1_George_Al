package lab10.ex2;

import lab10.ex2.Chair;

public class VictorianChair implements Chair {
    int age;

    public VictorianChair(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
