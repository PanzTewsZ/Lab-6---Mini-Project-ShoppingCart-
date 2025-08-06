package Lab_6;

public class BulkDiscountStrategy implements DiscountStrategy {
    private final double discountPercentage;
    private final int minimumQuantity;

    public BulkDiscountStrategy(int minimumQuantity, double discountPercentage) {
        this.discountPercentage = discountPercentage;
        this.minimumQuantity = minimumQuantity;
    }

    @Override
    public double calculateDiscountedPrice(CartItem item) {
        
       if (item.getQuantity() >= minimumQuantity) {
        double originalPrice = item.getProduct().getPrice() * item.getQuantity();
            return originalPrice * (1 - discountPercentage );
        } 
        return item.getProduct().getPrice() * item.getQuantity(); // No discount applied
        
    }
}
