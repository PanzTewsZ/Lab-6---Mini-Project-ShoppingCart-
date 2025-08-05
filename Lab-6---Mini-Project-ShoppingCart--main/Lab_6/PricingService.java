package Lab_6;

import java.util.*;

public class PricingService {
    private record StrategyRule(String sku, DiscountStrategy strategy) {};
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
    }
}
