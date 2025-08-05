package Lab_6;

public final class Product{
    private final String productId;
    private final String productName;
    private final double price;

    // Rep Inveriant (RI)
    //  productId and productName ไม่ใช่ Null และ เว้นว่าง
    //  price >= 0
    //  
    // Abstraction Function (AF)
    //  AF(productId, productName, price)
    
    /*
     * ตรวจสอบว่า RI จริงไหม
     */

    private void checkRep(){
        if (productId == null || productId.isBlank()) throw new RuntimeException("RI violate: productId error");
        if (productName == null || productId.isBlank()) throw new RuntimeException("RI violate: productName error");
        if (price < 0) throw new RuntimeException("RI violate: price error");
    }

    /*
     *
     * 
     */
    public Product(String productId, String productName ,double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        checkRep();
    }
    public String getProductId() { return productId;}
    public String getProductName() { return productName;}
    public double getPrice() { return price;}

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }

}
