package Lab_6;

public class DefaultPricingStrategy implements DiscountStrategy {
    /**
     * คำนวณราคาสุทธิหลังจากใช้กลยุทธ์ส่วนลด
     * @param item รายการสินค้าในตะกร้า
     * @return ราคาสุทธิหลังจากใช้ส่วนลด
     */
    @Override
    public double calculateDiscountedPrice(CartItem item) {
        return item.getProduct().getPrice() * item.getQuantity();
    }

}
