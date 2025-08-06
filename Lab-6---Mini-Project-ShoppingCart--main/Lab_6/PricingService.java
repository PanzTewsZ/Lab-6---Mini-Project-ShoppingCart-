package Lab_6;

import java.util.*;

public class PricingService {
    /*private record StrategyRule(String sku, DiscountStrategy strategy) {};
    private final ArrayList<StrategyRule> strategies = new ArrayList<>();
    private final DiscountStrategy defaultStrategy = new DefaultPricingStrategy();

    public void addStrategy(String sku, DiscountStrategy strategy) {
        StrategyRule ruleToRemove = null;
        for (StrategyRule rule : strategies) {
            if (rule.sku.equals(sku)) {
                ruleToRemove = rule;
                break;
            }
        }
        if (ruleToRemove != null) {
            strategies.remove(ruleToRemove);
        }
        strategies.add(new StrategyRule(sku, strategy));
    } */

        ArrayList<String> sku;
    ArrayList<DiscountStrategy> discountStrategies;

    public PricingService() {
        sku = new ArrayList<>();
        discountStrategies = new ArrayList<>();
    }

    // เพื่อลงทะเบียนโปรโมชั่นสำหรับรหัสสินค้า
    public void addStrategy(String productId, DiscountStrategy strategy) {
    
        if(!sku.contains(productId)) {
            sku.add(productId);
            discountStrategies.add(strategy);
        }
    }

    // คำนวณราคาสินค้าโดยใช้กลยุทธ์ที่ลงทะเบียนไว้
    public double calculateItemPrice(CartItem item) {
        int index = sku.indexOf(item.getProduct().getProductId());
        if (index != -1) {
            DiscountStrategy strategy = discountStrategies.get(index);
            return strategy.calculateDiscountedPrice(item);
        } else {
            // ถ้าไม่มีโปรโมชั่นสำหรับสินค้านั้นๆ ให้คืนราคาปกติ
            return item.getProduct().getPrice() * item.getQuantity();
        }
    }

}
