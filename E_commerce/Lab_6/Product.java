package Lab_6;

public final class Product {

    private final String productId;
    private final String productName;
    private final double price;

    private void CheckRep() {
        if (productId == null || productId.isBlank()) {
            throw new RuntimeException("RI violated : productId Error ");
        }
        if (productName == null || productName.isBlank()) {
            throw new RuntimeException("RI violated : productName Error ");
        } 
        if (price < 0) {
            throw new RuntimeException("RI violated : price Error ");
        }
    }
    
    public Product(String productID,String productName, double price, double price2 ) {
        this.productId = productID;
        this.productName = productName;
        this.price = price;
        CheckRep();
    }

    public String getproductID() { return productId; }
    public String getproductName() { return productName; }
    public double getprice() { return price; }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }

}
