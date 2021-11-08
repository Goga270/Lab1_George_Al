package lab1718.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("25.65 USD", "5000 RUR", "34.72 BNB", "17.020 USD", "12.05 EU");
        Pattern pattern = Pattern.compile("^([0-9]+.[0-9]{2}) (USD|RUR|EU)$");

        StringBuilder all = new StringBuilder();
        for (String str : list) {
            if (pattern.matcher(str).find()) {
                all.append(str).append(", ");
            }
        }
        System.out.println(all.substring(0, all.length()));
    }
}