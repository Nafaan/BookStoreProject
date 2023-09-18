package bookstoreproject.pricing;

public class PencilPricing extends Pricing{
    private double price;

    public PencilPricing(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
