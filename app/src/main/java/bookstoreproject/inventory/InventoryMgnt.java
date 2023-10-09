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
    }    public boolean isAvailable(ProductInfo product, int quantity) {
        return product.getQuantityInfo().getQuantity() >= quantity;
    }
 

    // Check if the required quantity of an InventoryItem is available
    public boolean isAvailable(InventoryItem item, int requiredQuantity) {
        return item.getQuantityInfo().getQuantity() >= requiredQuantity;
    }

    // Decrement the quantity of an InventoryItem by a given amount
    public void decrementQuantity(InventoryItem item, int decrementBy) {
        // Get the current quantity
        int currentQuantity = item.getQuantityInfo().getQuantity();

        // Calculate the new quantity
        int newQuantity = currentQuantity - decrementBy;

        // Ensure the new quantity is not negative
        newQuantity = Math.max(newQuantity, 0);

        // Update the quantity
        item.getQuantityInfo().setQuantity(newQuantity);
    }
}

