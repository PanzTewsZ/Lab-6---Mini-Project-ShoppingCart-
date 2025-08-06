package Lab_6;

public class BogoDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscountedPrice(CartItem item) {
        
        int quantity = item.getQuantity();
        int fullPriceItems = (quantity + 1) / 2; // ซื้อ 1 แถม 1
        return item.getProduct().getPrice() * fullPriceItems;

    }
}
