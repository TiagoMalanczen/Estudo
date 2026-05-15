package ecommerce;

public class TestMain {
    public static void main(String[] args) {
        //==========Attributes==========

        Product p1 = new Product("Teclado", 150.00);
        Product p2 = new Product("Mouse", 50.00);
        Product p3 = new Product("Monitor", 250.00);

        Order order1 = new Order(123, "James");
        Order order2 = new Order(321, "John");

        //==========Testing==========
        order1.addItem(p1, 1);
        order1.addItem(p2, 1);
        order1.addItem(p3, 2);

        order2.addItem(p1, 3);
        order2.addItem(p2, 2);
        order2.addItem(p3, 4);

        double order = order1.calculateTotal();
        System.out.println(order);

        order = order2.calculateTotal();
        System.out.println(order);
    }
}
