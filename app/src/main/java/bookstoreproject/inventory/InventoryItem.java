package bookstoreproject.inventory;

import bookstoreproject.product.*;
import bookstoreproject.pricing.*;
import bookstoreproject.quantity.*;

public abstract class InventoryItem {
    private ProductInfo productInfo = new ProductInfo();
    private QuantityInfo quantityInfo = new QuantityInfo();
    private PricingInfo pricingInfo = new PricingInfo();

    public InventoryItem(ProductInfo prodInfo, QuantityInfo quantInfo, PricingInfo priceInfo) {
        this.productInfo = prodInfo;
        this.quantityInfo = quantInfo;
        this.pricingInfo = priceInfo;
    }

   
}
