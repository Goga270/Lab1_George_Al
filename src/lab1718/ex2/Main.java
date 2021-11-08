package lab1718.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String testStr = "aE:dC:cA:56:76:54";

        Pattern pattern = Pattern.compile("^([a-zA-Z1-9]{2}[:]){5}([a-zA-Z1-9]{2})$");
        Matcher matcher = pattern.matcher(testStr);
        if (matcher.find()) {
            System.out.println("Да является MAK адресом");
        } else
            System.out.println("Нет не является MAK адресом");
    }
}
