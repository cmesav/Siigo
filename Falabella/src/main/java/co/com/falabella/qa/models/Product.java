package co.com.falabella.qa.models;

public class Product {

    private String productName;
    private String price;

    public Product(String nameProduct, String price) {
        this.productName = nameProduct;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
