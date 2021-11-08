package lab16.ex2;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Order[] restaurantOrders = new Order[20];
    private Map<String,Order> internetOrders = new HashMap<>();

    public void add(int tableNumber, Order order){
        restaurantOrders[tableNumber] = order;
    }

    public void add(String address, Order order){
        internetOrders.put(address,order);
    }

    public Order getOrders(int tableNumber){
        return restaurantOrders[tableNumber];
    }

    public Order getOrders(String address){
        return internetOrders.get(address);
    }

    public void addItem(Item item,int tableNumber){
        restaurantOrders[tableNumber].add(item);
    }

    public void addItem(Item item,String address){
        internetOrders.get(address).add(item);
    }

    public void removeItem(int tableNumber){
        restaurantOrders[tableNumber] = null;
    }

    public void removeItem(String address){
        internetOrders.remove(address);
    }

    public int freeTableNumber(){
        for (int i=0;i<20;i++){
            if(restaurantOrders[i]==null){
                return i;
            }
        }
        return 0;
    }

    public int[] freeTableNumbers(){
        int[] free = new int[20];
        int c=0;
        for(int i=0;i<20;i++){
            if(restaurantOrders[i]==null){
                free[c] = i;
                c++;
            }
        }
        return free;
    }

    public Order[] getRestaurantOrders() {
        return restaurantOrders;
    }

    public Order[] getInternetOrders(){
        return internetOrders.values().toArray(new Order[0]);
    }

    public double restaurantCostSummary(){
        double count =0;
        for (int i=0;i<20;i++){
            if(restaurantOrders[i]!=null){
                count+=restaurantOrders[i].costTotal();
            }
        }
        return count;
    }

    public double internetCostSummary(){
        double count=0;
        for(Order n:internetOrders.values()){
            if(n!=null){
                count+=n.costTotal();
            }
        }
        return count;
    }

    public int restaurantQuantity(String itemName){
        int count = 0;
        for(int i=0;i<20;i++){
            if(restaurantOrders[i]!=null){
                count+=restaurantOrders[i].itemQuantity(itemName);
            }
        }
        return count;
    }

    public int internetQuantity(String itemName){
        int count =0;
        for(Order n: internetOrders.values()){
            if(n!=null){
                count+=n.itemQuantity(itemName);
            }
        }
        return count;
    }
}
