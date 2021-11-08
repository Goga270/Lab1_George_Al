package lab11.ex3;

public class Variable {
    private String name;
    private int pow;

    public Variable(String name){
        this.name = name;
        this.pow = 1;
    }

    public Variable(String name,int pow){
        this.name = name;
        this.pow = pow;
    }

    public Const toConst(double v){
        return new Const(Math.pow(v,pow));
    }
}
