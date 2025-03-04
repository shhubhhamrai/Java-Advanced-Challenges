// Exercise 05: Created a package for an e-commerce system and defined the required classes...
package ecommerce;

import ecommerce.models.*;

public class Main {
    public static void main(String[] args) {
        // Create a product
        Product productA = new Product("Product A", 100.0);

        // Create a customer
        Customer johnDoe = new Customer("John Doe");

        // Create a shopping cart and add the product
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(productA);
        System.out.println("Shopping Cart: " + cart);

        // Create an order for the customer and add products
        Order order = new Order(johnDoe);
        order.addProduct(productA);

        // Display order details
        System.out.println("Order Details: " + order);
    }
}
