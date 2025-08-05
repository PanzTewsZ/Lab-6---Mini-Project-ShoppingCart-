package Lab_6;

public class BulkDiscountStrategy implements DiscountStrategy {
    private final double discountPercentage;
    private final int minimumQuantity;

    public BulkDiscountStrategy(double discountPercentage, int minimumQuantity) {
        this.discountPercentage = discountPercentage;
        this.minimumQuantity = minimumQuantity;
    }

    @Override
    public double calculateDiscountedPrice(CartItem item) {
        double originalPrice = item.getProduct().getPrice() * item.getQuantity();
       if (item.getQuantity() >= minimumQuantity) {
            return originalPrice * (1 - discountPercentage );
        } 
        return originalPrice; // No discount applied
        
    }
}
