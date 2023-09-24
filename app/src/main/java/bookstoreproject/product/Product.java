package bookstoreproject.product;

import bookstoreproject.inventory.*;
import bookstoreproject.pricing.*;

public abstract class Product {
    private Quantity productQuantity;
    private Pricing productPricing;
   // private Description productDescription;

   public Product(int quantity, double pricing) {
        productQuantity = new Quantity(quantity);
        productPricing = new Pricing(pricing);
   }

}
