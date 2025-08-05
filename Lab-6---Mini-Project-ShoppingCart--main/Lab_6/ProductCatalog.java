package Lab_6;

import java.util.*;


public class ProductCatalog {

    private  ArrayList<Product> products = new ArrayList<Product>();
    /**
     * ตรวจสอบความถูกต้องของตัวแทนจำหน่าย
     * - products ไม่ควรเป็น null
     * - ไม่มีสินค้าซ้ำกันในรายการ
     */
    private void CheckRep() {
        if (products == null) {
            throw new RuntimeException("RI violated: products list cannot be null");
        }
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < products.size(); j++) {
                if (products.get(i).equals(products.get(j))) {
                    throw new RuntimeException("RI violated: duplicate products found");
                }
            }
        }
    }

    public ProductCatalog() {
    CheckRep();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findById(String productId) {
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                return p;
            }
        }
        return null;
    }
} 