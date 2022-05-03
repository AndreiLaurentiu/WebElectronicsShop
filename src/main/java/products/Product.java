package products;

public abstract class Product implements Comparable<ItUserDevices>{
	private static int idProductIndex = 1;
    private int idProduct;
    private String productName;
    private String brand;
    private float weight;
    private String dimensions;
    private String colour;
    private int price;
    public Product(String productName, String brand, float weight, String dimensions, String colour, int price) {
        this.idProduct = idProductIndex;
        this.productName = productName;
        this.brand = brand;
        this.weight = weight;
        this.dimensions = dimensions;
        this.colour = colour;
        this.price = price;
        idProductIndex++;
    }
    
    public String getProductName() {
    	return productName;
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
    
    public int compareTo(ItUserDevices iud) {
    	if(this.getPrice() == iud.getPrice())
    		return 0;
    	else if(this.getPrice() < iud.getPrice())
    		return -1;
    	else
    		return 1;
    }
}
