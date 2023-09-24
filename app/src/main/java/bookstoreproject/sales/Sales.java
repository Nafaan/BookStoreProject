package bookstoreproject.sales;

import bookstoreproject.inventory.*;
import bookstoreproject.product.*;

public class Sales {

    private InventoryArray inventory;

    public Sales(InventoryArray inventory) {
        this.inventory = inventory;
    }

    public boolean makeSale(Product product, String productType, int quantity) {
        double price = product.getPricingInfo().getPrice();
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
