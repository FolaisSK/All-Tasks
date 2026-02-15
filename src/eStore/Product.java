package eStore;

public class Product {
    private long productId;
    private String productName;
    private double price;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(long productId, String productName, double price, String productDescription, ProductCategory productCategory){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }
}
