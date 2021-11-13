package lab2324.ex1;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    private double raschodi = 0;
    private double dochodi = 0;
    private Map<String,Double> rashodiPerCompany = new HashMap<String,Double>();

    public void Calculate(String str) {
        String[] stroka = str.split(",", 8);
        this.raschodi += Double.parseDouble(stroka[7].replaceAll("\\\"", "").replace(',', '.'));
        this.dochodi += Double.parseDouble(stroka[6]);

        String[] s = stroka[5].trim().split(" {3,}")[1].split("/");
        String[] strokaCompany = s[s.length - 1].split("\\\\");
        String company = strokaCompany[strokaCompany.length - 1];

        if (!rashodiPerCompany.containsKey(company)) {
            rashodiPerCompany.put(company, Double.parseDouble(stroka[7].replaceAll("\\\"", "").replace(',', '.')));
        } else {
            double sum = rashodiPerCompany.get(company);
            sum += Double.parseDouble(stroka[7].replaceAll("\\\"", "").replace(',', '.'));
            rashodiPerCompany.put(company, sum);
        }

    }
        public void Print(){
            System.out.println("Сумма доходов:" + this.dochodi + " rub");
            System.out.println("Сумма расходов " + this.raschodi + " rub");
            System.out.println("Расходы по коспаниям");
            for(String company : this.rashodiPerCompany.keySet()){
                System.out.println(company + ": " + this.rashodiPerCompany.get(company) + "руб");
        }


    }

    public void CalculateDochodov(String str, double dochod){

    }
}
