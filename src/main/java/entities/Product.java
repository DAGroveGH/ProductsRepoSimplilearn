package entities;

public class Product {
    private int productId;
    private String productName;
    private String manufacturer;
    private float price;
    private float weight;
    private boolean available;

    public int getId() {
        return productId;
    }

    public void setId(int id) {
        this.productId = productId;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int compareName(Product a, Product b) {
        return a.productName.compareTo(b.productName);
    }

    @Override
    public String toString() {
        return "Product: \n" +
                "name - " + productName + "\n " +
                "manufacturer - " + manufacturer + "\n " +
                "price - " + price + "\n " +
                "weight - " + weight + "\n " +
                "available - " + available + "\n ";
    }
}
