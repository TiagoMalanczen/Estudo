package clubchess;

public class Product {

    //==========Attributes==========
    private String name;
    private double price;
    private int requiredRating;

    //==========Constructor==========
    public Product(String name, double price, int requiredRating) {
        this.name = name;
        this.price = price;
        this.requiredRating = requiredRating;
    }

    //==========Getters==========
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRequiredRating() {
        return requiredRating;
    }

    //==========Setters==========
    public void setPrice(double price) {
        this.price = price;
    }

    public void setRequiredRating(int requiredRating) {
        this.requiredRating = requiredRating;
    }
}
