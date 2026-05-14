package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {

    //==========Attributes==========
    private int id;
    private String clientName;
    private List <OrderItem> items;

    //==========Constructor==========
    public Order(int id, String clientName){
        this.clientName = clientName;
        this.id = id;
        this.items = new ArrayList<>();
    }

    //==========Methods==========
    public  void addItem(Product product, int qty){
        items.add(new OrderItem(product,qty));
    }

    public double calculateTotal(){
        double total = 0;
        for (OrderItem orderItem: items){
           total += orderItem.subTotal();
        }
        return total;
    }
}
