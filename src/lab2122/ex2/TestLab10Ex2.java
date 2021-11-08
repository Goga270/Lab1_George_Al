package lab2122.ex2;

public class TestLab10Ex2 {
    public static void main(String[] args){
        Client c = new Client();
        ChairFactory factory = new ChairFactory();
        c.setChair(factory.createMagicChair());
        ((MagicChair) c.chair).doMagic();
        c.setChair(factory.createFunctionalChair());
        int z = ((FunctionalChair) c.chair).sum(1,2);
        System.out.println(z);
        c.setChair(factory.createVictorianChair());
        int age = ((VictorianChair) c.chair).getAge();
        System.out.println(age);
    }
}
