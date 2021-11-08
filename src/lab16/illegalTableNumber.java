package lab16;

public class illegalTableNumber extends Exception {
    public illegalTableNumber() {
        super("Столика с таким номером не существует");
    }
}
