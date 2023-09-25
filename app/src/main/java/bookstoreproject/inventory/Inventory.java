package bookstoreproject.inventory;
import bookstoreproject.product.*;

public class Inventory {
    private int quantity;

    public boolean isAvailable(Product product, int quantity) {
        return product.getQuantityInfo().getQuantity() >= quantity;
    }

    public void decrementStock(Product product, int quantity) {
        this.quantity = product.getQuantityInfo().getQuantity() - quantity;
        product.getQuantityInfo().setQuantity(this.quantity);
    }
}


