package clubchess;

import java.util.ArrayList;
import java.util.List;

public class Member {
    //==========Attributes==========
    private String name;
    private int rating;
    private double wallet;
    private List<Product> inventory;

    //==========Constructor==========
    public Member(String name, int rating, double wallet) {
        this.name = name;
        this.rating = rating;
        this.wallet = wallet;
        this.inventory = new ArrayList<>();
    }

    //==========Methods==========
    public void buyProduct(Product product) {
        if (rating >= product.getRequiredRating()) {
            if (wallet >= product.getPrice()) {
                System.out.println("Purchase finish " + product.getName() + " added for " + name);
                wallet -= product.getPrice();
                inventory.add(product);
            } else {
                System.out.println("Your wallet is not sufficient.");
            }
        } else {
            System.out.println("Your rating isn't sufficient.");
        }
    }
    public boolean hasBonus() {
        for (Product p : this.inventory) {
            if (p.getName().equalsIgnoreCase("Intensive training"))
                return true;
        }
        return false;
    }
    //==========Getters==========
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public double getWallet() {
        return wallet;
    }

    public List<Product> getInventory() {
        return inventory;
    }

    //==========Setters==========
    public void setRating(int rating) {
        this.rating = rating;
    }

}

