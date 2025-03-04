package ecommerce.models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public void clearCart() {
        items.clear();
    }

    @Override
    public String toString() {
        return "ShoppingCart {items= " + items + ", totalPrice= " + getTotalPrice() + "}";
    }
}

