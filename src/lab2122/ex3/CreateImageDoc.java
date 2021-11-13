package lab2122.ex3;

public class CreateImageDoc implements InterfaceDocument    {
    @Override
    public Document CreateNew() {
        System.out.println("Image draw");
        return new ImageDoc();
    }

    @Override
    public Document CrOpen() {
        System.out.println("Image open");
        return new ImageDoc();
    }
}
