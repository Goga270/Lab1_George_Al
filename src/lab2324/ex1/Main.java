package lab2324.ex1;


import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        //Reader reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("src/lab2324/csv/final_transaction_table.csv").toURI()));
        //CsvToBean csv = new CsvToBean();
        String csvFilename = "src/lab2324/csv/final_transaction_table.csv";
       // CSVReader csvReader = new CSVReader(new FileReader(csvFilename),';');
        //System.out.println(csvReader);
        //Path pathtofile = Paths.get("src/lab2324/csv/final_transaction_table.xlsx");
        List<String> list = Files.readAllLines(Paths.get("src/lab2324/csv/movementList.csv"));


        Parser parser = new Parser();
        for(int i=1;i<list.size();i++){
            parser.Calculate(list.get(i));
        }

        parser.Print();
        /*
        String[] col = list.get(3).split(",",8);
        System.out.println(col[5].trim().split(" {3,}")[1]);
        String[] temp = (col[5].trim().split(" {3,}")[1]).split("/");
        String[] suppliesTmp = temp[temp.length-1].split("\\\\");
        String[] suppliess = suppliesTmp[suppliesTmp.length-1].split(" ");
        String supplies = suppliess[suppliess.length-1];
        System.out.println(supplies);
         */
        //System.out.println(list)
        //List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\gosha\\IdeaProjects\\JavaLab\\src\\lab2324\\csv\\final_transaction_table.csv"));
        //System.out.println(lines.get(1));

    }
}
