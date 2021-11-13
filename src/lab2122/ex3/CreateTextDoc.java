package lab2122.ex3;

public class CreateTextDoc implements InterfaceDocument{

    @Override
    public Document CreateNew() {
        System.out.println("Text Created");
        return new TextDoc();
    }

    @Override
    public Document CrOpen() {
        System.out.println("TextDoc open");
        return new TextDoc();
    }
}
