package ecommerce;

public class OrderItem {
    //==========Attributes==========
    private Product product;
    private int quantity;

    //==========Constructor==========
    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    //==========Methods==========
    public double subTotal(){
    return quantity * product.getPrice();
    }
}
