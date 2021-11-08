package lab16.ex2;

public class RestaurantOrder implements Order{
    private int size=0;
    private Item[] items = new Item[15];

    @Override
    public boolean add(Item item) {
        if(size<15){
            items[size]= item;
            size++;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean remove(String itemName) {
        for(int i=0;i<size;i++){
            if(items[i].getname().equals(itemName)){
                for (int j = i; j < size - 1;j++)
                    items[j] = items[j + 1];
                items[size-1]=null;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String itemName){
        int count=0;
        for(int i=0;i<size;i++){
            if(items[i].getname().equals(itemName)){
                for (int j = i; j < size - 1;j++)
                    items[j] = items[j + 1];
                items[size-1]=null;
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName){
        int count=0;
        for(int i=0;i<size;i++){
            if(items[i].getname().equals(itemName)){
                count++;
            }
        }
        return count;
    }

    @Override
    public double costTotal() {
        double count = 0;
        for(int i=0;i<size;i++){
            count+=items[i].getCost();
        }
        return count;
    }

    @Override
    public String[] itemsNames(){
        String[] res = new String[size];
        for(int i=0;i<size;i++){
            res[i]=items[i].getname();
        }
        return res;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        for(int i=size-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(items[j].getCost()>items[j+1].getCost()){
                    Item k = items[j];
                    items[j] = items[j+1];
                    items[j+1] = k;
                }
            }
        }
        return items;
    }
}
