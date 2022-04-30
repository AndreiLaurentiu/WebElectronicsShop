package products;

public abstract class Product {
    private int idProduct;
    private String brand;
    private float weight;
    private String dimensions;
    private String colour;
    private int price;
    public Product(int idProduct, String brand, float weight, String dimensions, String colour, int price) {
        this.idProduct = idProduct;
        this.brand = brand;
        this.weight = weight;
        this.dimensions = dimensions;
        this.colour = colour;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public float getWeight() {
        return weight;
    }

    public String getDimensions() {
        return dimensions;
    }
}
