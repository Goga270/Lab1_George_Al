package lab1920;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class NumberGenerator {
    public static void main(String[] args){
        int a=0,b=200;
        int c = a + (int)(Math.random()*b);
        String[] letter = {"A","B","E","K","M","H","O","P","C","T","Y","X"};
        Arrays.sort(letter);
        //Set<String> arrNumber = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<>();

        String num;
        //одинаковые буквы
        for(String a123: letter) {
            for(int reg = 1; reg <= 199; reg++) {
                for(int j = 1; j <= 999; j++) {
                    num = a123 + j + j + j + a123 + a123 + reg;
                    arrayList.add(num);
                    treeSet.add(num);
                    hashSet.add(num);
                    //arrNumber.add(String.format("%s%03d%s%s%d",a123,j,a123,a123,reg));
                }
            }
        }

        for(int i = 111; i <= 999; i += 111) {
            for (String a1 : letter) {
                for (String a2 : letter) {
                    for (String a3 : letter) {
                        for (int reg = 1; reg <= 199; reg++) {
                            num =a1 + i+a2+a3+reg;
                            arrayList.add(num);
                            treeSet.add(num);
                            hashSet.add(num);
                            //arrNumber.add(String.format("%s%03d%s%s%d", a1, i, a2, a3, reg));
                        }
                    }
                }
            }
        }
        System.out.println(arrayList);
        Scanner in = new Scanner(System.in);
        boolean t;
        long beginTime, elapsedTime;
        int tt;
        String k1 = in.next();
        beginTime = System.nanoTime();
        t = arrayList.contains(k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (t) System.out.println("Поиск перебором: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск перебором: номер не найден, поиск занял " + elapsedTime +"нс");
        Collections.sort(arrayList);
        beginTime = System.nanoTime();
        tt = Collections.binarySearch(arrayList, k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (tt >=0) System.out.println("Поиск binarySearch: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск binarySearch: номер не найден, поиск занял " + elapsedTime +"нс");
        beginTime = System.nanoTime();
        t = treeSet.contains(k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (t) System.out.println("Поиск treeSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск treeSet: номер не найден, поиск занял " + elapsedTime +"нс");
        beginTime = System.nanoTime();
        t = hashSet.contains(k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (t) System.out.println("Поиск hashSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск hashSet: номер не найден, поиск занял " + elapsedTime +"нс");
        //System.out.println(f);
        //System.out.println(arrNumber);
    }
}
