package bookstoreproject.inventory;

import bookstoreproject.product.*;

import java.util.ArrayList;
import java.util.List;

public class InventoryArrayList {
    private List<Product> products;

    public InventoryArrayList() {
        // Initialize the inventory with some products
        products = new ArrayList<>();
        products.add(new Book(10));
        products.add(new Stationary(20));
        products.add(new Pencil(30));
        products.add(new Pen(15));
    }

    public boolean isAvailable(Product requestedProduct, int requiredQuantity) {
        for (Product product : products) {
            if (product.getClass().equals(requestedProduct.getClass())) {
                return product.getQuantity() >= requiredQuantity;
            }
        }
        return false;
    }

    public void decrementStock(Product requestedProduct, int decrementBy) {
        for (Product product : products) {
            if (product.getClass().equals(requestedProduct.getClass())) {
                int newQuantity = product.getQuantity() - decrementBy;
                if (newQuantity >= 0) {
                    product.setQuantity(newQuantity);
                }
                break;
            }
        }
    }
}
