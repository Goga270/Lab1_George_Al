package lab1;

import java.lang.*;
public class Book {
    private String name;
    private int pages;

    public Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    public String getName(){
        return this.name;
    }


    public int getPages(){
        return this.pages;
    }
    @Override
    public String toString(){
        return ("The book " + this.name + " has " + this.pages + " pages");
    }
}
