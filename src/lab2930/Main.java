package lab2930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Comparator<Map.Entry<String,Integer>> sortByKey = Map.Entry.comparingByKey();
        Comparator<Map.Entry<String,Integer>> sortByValue = Map.Entry.comparingByValue(Comparator.reverseOrder());
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine().toLowerCase().replaceAll("[!,.]", "");
        System.out.println(str);

        String[] words = str.split(" ");
        System.out.println(words[words.length-1]);

        //Set<Map.Entry<Map.Entry<String, Integer>, Integer>> Array =
        Arrays.stream(words).collect(Collectors.groupingBy(x->x,Collectors.summingInt(p->1))).entrySet().stream()
                .sorted(sortByKey.thenComparing(sortByValue))
                .sorted(sortByValue).limit(10).forEach(System.out::println);
        //System.out.println(Array);
    }
}
