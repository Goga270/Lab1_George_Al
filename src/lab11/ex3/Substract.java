package lab11.ex3;

public class Substract extends Operator{
    public Substract(Operand left, Operand right){
        super(left,right);
    }

    public Substract(Operand left, Variable vRight){
        super(left,vRight);
    }

    public Substract(Variable vLeft,Variable vRight){
        super(vLeft,vRight);
    }

    public Substract(Variable vLeft,Operand right){
        super(vLeft,right);
    }

    @Override
    public double getValue(){
        return (left.getValue() - right.getValue());
    }
}
