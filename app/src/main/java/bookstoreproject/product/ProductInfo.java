package bookstoreproject.product;


public abstract class ProductInfo {
    private String name;

    public ProductInfo(String name) {
        this.name = name;
    }
    
    public String getProductName() {
        return(name);
    }

    public void setProductName(String name) {
        this.name = name;
    }
}
