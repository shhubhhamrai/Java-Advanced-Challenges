package ecommerce.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalAmount() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Order{customer= " + customer.getName() +
                ", products= " + products +
                ", totalAmount= " + getTotalAmount() + "}";
    }
}
