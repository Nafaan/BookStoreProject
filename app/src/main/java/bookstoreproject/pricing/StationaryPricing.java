package bookstoreproject.pricing;

public class StationaryPricing extends Pricing {
    
    private double price;

    public StationaryPricing(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
