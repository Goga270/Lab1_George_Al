package lab10.ex2;

public class ChairFactory implements AbstractFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(5);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

}
