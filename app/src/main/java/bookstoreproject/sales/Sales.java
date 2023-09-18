package bookstoreproject.sales;

import bookstoreproject.inventory.InventoryArray;
import bookstoreproject.pricing.*;
import bookstoreproject.product.*;

public class Sales {

    private InventoryArray inventory;
    private Pricing pricing;

    public Sales(InventoryArray inventory, Pricing pricing) {
        this.inventory = inventory;
        this.pricing = pricing;
    }

    public boolean makeSale(String productType, int quantity) {
        double price = pricing.getPrice(productType);
        boolean isAvailable = inventory.isAvailable(productType, quantity);

        if (isAvailable) {
            inventory.decrementStock(productType, quantity);
            
            // Update Sales Counter (assuming it's a static class)
            SalesCounter.updateTotalSales(price * quantity);
            SalesCounter.updateTotalUnits(quantity);
            return true;
        }

        return false;
    }
}
