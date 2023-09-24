package bookstoreproject.pricing;

public class BookPricing extends PricingInfo{
    private double price;

    public BookPricing(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
