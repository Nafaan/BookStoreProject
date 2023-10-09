package bookstoreproject.sales;

import bookstoreproject.inventory.*;
import bookstoreproject.product.*;

public class Sales {

    private InventoryMgnt inventory;

    public Sales(InventoryMgnt inventory) {
        this.inventory = inventory;
    }

    public boolean makeSale(ProductInfo product, int quantity) {
        double price = product.getPricingInfo().getPrice();
        boolean isAvailable = inventory.isAvailable(product, quantity);

        if (isAvailable) {
            inventory.decrementStock(product, quantity);
            
            // Update Sales Counter (assuming it's a static class)
            SalesCounter.updateTotalSales(price * quantity);
            SalesCounter.updateTotalUnits(quantity);
            return true;
        }

        return false;
    }
}
