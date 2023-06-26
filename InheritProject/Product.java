public class Product {
    private String productName;
    private int quantity;
    private float cost;

    public Product(String productName, int quantity, float cost) {
        this.productName = productName;
        this.quantity = quantity;
        this.cost = cost;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", quantity=" + quantity + ", cost=" + cost + '}';
    }
    
    
}
