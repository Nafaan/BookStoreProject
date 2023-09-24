package bookstoreproject.pricing;

public class PencilPricing extends PricingInfo{
    private double price;

    public PencilPricing(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
