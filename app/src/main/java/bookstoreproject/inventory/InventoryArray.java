package bookstoreproject.inventory;

import bookstoreproject.product.*;

public class InventoryArray {
    private Product[] products;

    public InventoryArray() {
        // Initialize the stock for each product type
        products = new Product[4];
        products[0] = new Book(10);
        products[1] = new Stationary(20);
        products[2] = new Pencil(30);
        products[3] = new Pen(15);
    }

    public boolean isAvailable(String productType, int requiredQuantity) {
        for (Product product : products) {
            if (product.getClass().getSimpleName().equals(productType)) {
                return product.getQuantity() >= requiredQuantity;
            }
        }
        return false;
    }

    public void decrementStock(String productType, int decrementBy) {
        for (Product product : products) {
            if (product.getClass().getSimpleName().equals(productType)) {
                int newQuantity = product.getQuantity() - decrementBy;
                product.setQuantity(newQuantity);
                break;
            }
        }
    }
}

