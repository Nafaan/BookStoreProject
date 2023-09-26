package bookstoreproject.inventory;

import bookstoreproject.product.*;
import bookstoreproject.pricing.*;
import bookstoreproject.quantity.*;

import java.util.ArrayList;
import java.util.List;

public class InventoryArrayList {
    private ArrayList<InventoryItem> items;

    public InventoryArrayList() {
        // Initialize the inventory with some products
        items = new ArrayList<InventoryItem>();

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
