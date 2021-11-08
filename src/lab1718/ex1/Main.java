package lab1718.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String testStr = "abcdefghijklmnopqrstuv18340";
        System.out.println("Является ли строка в testStr строкой 'abcdefghijklmnopqrstuv18340': "
                + testStr.matches("abcdefghijklmnopqrstuv18340"));

        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(testStr);
        if(matcher.find()) {
            System.out.println("Да является");
        }else
            System.out.println("Нет не является");
    }
}
