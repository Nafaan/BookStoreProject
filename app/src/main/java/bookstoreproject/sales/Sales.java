package bookstoreproject.sales;

import bookstoreproject.inventory.*;
public class Sales {

    private InventoryMgnt inventory;

    public Sales(InventoryMgnt inventory) {
        this.inventory = inventory;
    }

    public boolean makeSale(InventoryItem item, int quantity) {
        double price = item.getPricingInfo().getPrice();
        boolean isAvailable = inventory.isAvailable(item, quantity);

        if (isAvailable) {
            try {
                inventory.decrementQuantity(item, quantity);
                SalesCounter.updateTotalSales(price * quantity);
                SalesCounter.updateTotalUnits(quantity);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                return false;
            }
            
            return true;
        }

        return false;
    }
}
