package bookstoreproject.inventory;
import bookstoreproject.product.*;

public class Inventory {
    private int quantity;

    public boolean isAvailable(ProductInfo product, int quantity) {
        return product.getQuantityInfo().getQuantity() >= quantity;
    }

    public void decrementStock(ProductInfo product, int quantity) {
        this.quantity = product.getQuantityInfo().getQuantity() - quantity;
        product.getQuantityInfo().setQuantity(this.quantity);
    }
}


