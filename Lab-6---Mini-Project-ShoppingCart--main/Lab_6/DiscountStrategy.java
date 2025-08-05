package Lab_6;

public interface DiscountStrategy {
    /**
     * คำนวณราคาสุทธิหลังจากใช้กลยุทธ์ส่วนลด
     * @param item รายการสินค้าในตะกร้า
     * @return ราคาสุทธิหลังจากใช้ส่วนลด
     */
    double calculateDiscountedPrice(CartItem item);

    
}