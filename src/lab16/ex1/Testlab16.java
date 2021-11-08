package lab16.ex1;

import lab16.ex2.*;

import java.util.Arrays;
import java.util.Scanner;

public class Testlab16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //first
        System.out.println("Создаем первый напиток:");
        String firstName = in.next();
        String firstDescription = in.next().replace('_', ' ');
        Drink firstDrink = new Drink(firstName, firstDescription);

        System.out.println("Узнаем его Цену: $" + firstDrink.getCost());
        System.out.println("Узнаем его Описание: " + firstDrink.getDiscription());
        System.out.println("Узнаем его Название: " + firstDrink.getname());

        System.out.println(firstDrink.toString());

        System.out.println("Создаем второй напиток:");
        String secondName = in.next();
        int secondCost = in.nextInt();
        String secondDescription = in.next().replace('_', ' ');
        Drink secondDrink = new Drink(secondCost, secondName, secondDescription);

        System.out.println("Узнаем его Цену: $" + secondDrink.getCost());
        System.out.println("Узнаем его Описание: " + secondDrink.getDiscription());
        System.out.println("Узнаем его Название: " + secondDrink.getname());

        System.out.println(secondDrink.toString());
        //////////////////////////
        System.out.println("////////////////////////////////////////");
        Item drink1 = new Drink(5, "Coca-Cola", "Вредный, но вкусные напиток");
        Item dish1 = new Dish(25,"Шашлык в ассортименте","Сымый лучший шашлык-машлык в городе");
        Item drink2 = new Drink(10, "Pepsi", "Вредный, но вкусные напиток");
        Item drink3 = new Drink(15, "Dr.Pepper", "Вредный, но вкусные напиток");
        Item dish2 = new Dish(50,"Лобстеры","Очень вкусные лобстеры");

        OrderManager orderManager = new OrderManager();

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(drink1);
        internetOrder.add(drink2);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(drink3);
        restaurantOrder.add(dish1);

        RestaurantOrder restaurantOrder2 = new RestaurantOrder();
        restaurantOrder2.add(dish1);
        restaurantOrder2.add(dish2);
        restaurantOrder2.add(dish1);

        orderManager.add("Москва, ул. Свободы, д. 91", internetOrder);
        orderManager.add("Москва, пр. Вернадского, д. 78", internetOrder);
        orderManager.add(0, restaurantOrder2);
        orderManager.add(5, restaurantOrder);

        System.out.println("Количество в Ресторанных заказах - Coca-Cola: " + orderManager.restaurantQuantity("Coca-Cola"));
        System.out.println("Количество в Ресторанных заказах - Шашлык: " + orderManager.restaurantQuantity("Шашлык в ассортименте"));
        System.out.println("Количество в Интернет заказах - Шашлык: " + orderManager.internetQuantity("Шашлык в ассортименте"));
        System.out.println("Интернет сумма - $" + orderManager.internetCostSummary());
        System.out.println("Ресторанная сумма - $" + orderManager.restaurantCostSummary());
        System.out.println("Следующий свободный стол - №" + orderManager.freeTableNumber());
        System.out.println("Свободные столы - " + Arrays.toString(orderManager.freeTableNumbers()));
    }
}
