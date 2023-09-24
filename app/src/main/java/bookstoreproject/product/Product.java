package bookstoreproject.product;

import bookstoreproject.inventory.*;
import bookstoreproject.pricing.*;

public abstract class Product {
    private QuantityInfo quantityInfo;
    private PricingInfo pricingInfo;
    // private Description productDescription;

    public Product(int quantity, double pricing) {
        this.quantityInfo = new QuantityInfo(quantity);
        this.pricingInfo = new PricingInfo(pricing);
    }

    public QuantityInfo getQuantityInfo(){ 
        return this.quantityInfo;
    }

    public PricingInfo getPricingInfo(){ 
        return this.pricingInfo;
    }
}
