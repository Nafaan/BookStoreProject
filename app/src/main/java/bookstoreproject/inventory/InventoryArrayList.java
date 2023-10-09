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

    public boolean isAvailable(ProductInfo requestedProduct, int requiredQuantity) {
        for (ProductInfo product : products) {
            if (product.getClass().equals(requestedProduct.getClass())) {
                return product.getQuantity() >= requiredQuantity;
            }
        }
        return false;
    }

    public void decrementStock(ProductInfo requestedProduct, int decrementBy) {
        for (ProductInfo product : products) {
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
