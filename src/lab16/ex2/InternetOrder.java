package lab16.ex2;

public class InternetOrder implements Order{
    OrderList<Item> list = new OrderList<>();

    public InternetOrder(){}

    public InternetOrder(Item[] items){
        for(int i=0;i<items.length;i++){
            list.add(items[i]);
        }
    }

    @Override
    public boolean add(Item item) {
        list.add(item);
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        OrderList.Node<Item> current = list.getFront();
        while (current!=null){
            Item i = current.data;
            if(i.getname().equals(itemName)){
                list.remove(i);
                return true;
            }
            current = list.getNext(current);
        }
        return false;
    }

    public int removeAll(String itemName){
        int count =0;
        OrderList.Node<Item> current = list.getFront();
        while (current!=null){
            Item i = current.data;
            if(i.getname().equals(itemName)){
                list.remove(i);
                count++;
            }
            current = list.getNext(current);
        }
        return count;
    }

    @Override
    public int itemQuantity() {
        return list.size();
    }

    @Override
    public double costTotal() {
        double count = 0;
        OrderList.Node<Item> current = list.getFront();
        while (current!=null){
            Item i = current.getData();
            count+=i.getCost();
            current = list.getNext(current);
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        Item[] items = new Item[list.size()];
        int i=0;
        OrderList.Node<Item> current = list.getFront();
        while (current!=null){
            Item it = current.getData();
            items[i] = it;
            i++;
            current = list.getNext(current);
        }
        return items;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count =0;
        OrderList.Node<Item> current = list.getFront();
        while (current!=null){
            Item i = current.getData();
            if(i.getname().equals(itemName)){
                count++;
            }
            current = list.getNext(current);
        }
        return count;
    }

    @Override
    public String[] itemsNames() {
        String[] res = new String[list.size()];
        int n=0;
        OrderList.Node<Item> current = list.getFront();
        while (current!=null){
            Item i = current.getData();
            res[n] = i.getname();
            n++;
            current = list.getNext(current);
        }
        return res;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] items = getItems();
        for(int i=list.size();i>=1;i--){
            for(int j=0;j<i;j++){
                if(items[j].getCost()>items[j+1].getCost()){
                    Item temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }
        return items;
    }
}
