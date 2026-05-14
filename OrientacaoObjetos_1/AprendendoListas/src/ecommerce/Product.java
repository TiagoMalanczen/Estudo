package ecommerce;

public class Product {

    //==========Attributes==========
    private String name;
    private double price;

    //==========Constructor==========
    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }

    //==========Getters==========
    public String getNome(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
