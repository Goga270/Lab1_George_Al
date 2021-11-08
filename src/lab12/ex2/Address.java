package lab12.ex2;
import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, block, flat;

    public Address() {
    }

    public void addAddress(String data, int i) {
        switch (i) {
            case 0 -> country = data;
            case 1 -> region = data;
            case 2 -> city = data;
            case 3 -> street = data;
            case 4 -> house = data;
            case 5 -> block = data;
            case 6 -> flat = data;
        }
    }

    public String toString() {
        return ("Адресс: " + country + " (" + region + ") - г. " + city + " ул. " +
                street + " д. " + house + " к. " + block + " кв. " + flat);
    }

    public static void main(String[] args) {
        int i = 0, j = 0;
        Address address = new Address();
        System.out.println("Первое задание:");
        String str1 = "Россия, 777, Москва, Свободы, 91, 1, 393";
        System.out.println(str1);
        for (String data : str1.replace(" ", "").split(",")) {
            address.addAddress(data, i);
            i++;
        }
        System.out.println(address + "\n\n");


        System.out.println("Второе задание:");
        String str2 = "Россия, 777. Москва; Свободы - 91: 1, 393";
        System.out.println(str2);
        str2 = str2.replace(" ", "");
        StringTokenizer st = new StringTokenizer(str2, ",.;-:");
        while (st.hasMoreTokens()) {
            address.addAddress(st.nextToken(), j);
            j++;
        }
        System.out.println(address);

    }
}
