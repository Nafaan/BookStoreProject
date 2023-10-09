package bookstoreproject.inventory;

import java.util.HashMap;
import bookstoreproject.product.*;
import bookstoreproject.pricing.*;
import bookstoreproject.quantity.*;

public class InventoryMgnt {

    // HashMap to store inventory items
    private HashMap<ProductInfo, InventoryItem> inventory;

    public InventoryMgnt() {
        this.inventory = new HashMap<>();
    }

    // Add an item to the inventory
    public void addItem(ProductInfo productInfo, InventoryItem item) {
        this.inventory.put(productInfo, item);
    }

    // Retrieve an item from the inventory based on its ProductInfo
    public InventoryItem getItem(ProductInfo productInfo) {
        return this.inventory.get(productInfo);
    }

    // Check if an item exists in the inventory based on its ProductInfo
    public boolean containsItem(ProductInfo productInfo) {
        return this.inventory.containsKey(productInfo);
    }

    // Remove an item from the inventory based on its ProductInfo
    public void removeItem(ProductInfo productInfo) {
        this.inventory.remove(productInfo);
    }

    // Possibly more methods depending on what you'd like to achieve with the inventory management system.
}

