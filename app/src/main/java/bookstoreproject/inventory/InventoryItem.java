package bookstoreproject.inventory;

import bookstoreproject.product.*;
import bookstoreproject.pricing.*;
import bookstoreproject.quantity.*;

public abstract class InventoryItem {
    private ProductInfo productInfo = new ProductInfo() ;
    private QuantityInfo quantityInfo = new QuantityInfo();
    private PricingInfo pricingInfo = new PricingInfo();

    public InventoryItem(String name, int quantity, double price) {
        this.productInfo.setProductInfoName(name);
        this.quantityInfo.setQuantity(quantity);
        this.pricingInfo.setPrice(price);
    }

    public QuantityInfo getQuantityInfo() {
        return quantityInfo;
    }

    public ProductInfo getProductInfo(){
        return productInfo;
    }

    public PricingInfo getPricingInfo(){
        return pricingInfo;
    }
   
}
