package lab16.ex2;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int itemQuantity();
    double costTotal();
    Item[] getItems();
    int itemQuantity(String itemName);
    String[] itemsNames();
    Item[] sortedItemsByCostDesc();
}
