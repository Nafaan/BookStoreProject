package bookstoreproject.pricing;

public class PenPricing extends PricingInfo {
    private double price;

    public PenPricing(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
