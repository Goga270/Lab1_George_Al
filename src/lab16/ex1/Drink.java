package lab16.ex1;

import lab16.ex2.Item;

final class Drink implements Item {
    final int cost;
    final String name;
    final String description;
    Drink(String name,String description){
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    Drink(int cost, String name, String description){
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getDiscription() {
        return description;
    }

    public int getCost() {
        return cost;
    }


    @Override
    public String toString(){
        return ("Ваш напиток - " + this.name + " выходит по стоимости - " + this.cost + "Описание: " + this.description);
    }
}
