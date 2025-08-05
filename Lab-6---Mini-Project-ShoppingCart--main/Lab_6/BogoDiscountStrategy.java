package Lab_6;

public class BogoDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscountedPrice(CartItem item) {
        
        int quantity = item.getQuantity();
        double pricePerItem = item.getProduct().getPrice();

        // Buy one get one free: every two items, you pay for one
        int paidItems = (quantity / 2) + (quantity % 2); // Pay for half the items, plus one if odd
        return paidItems * pricePerItem; 
    }
}
