package products;

import java.util.LinkedList;

public class Order {
    private int idOrder;
    private LinkedList<Product> products;

    public Order(int idOrder, LinkedList<Product> products) {
    	this.idOrder = idOrder;
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    
    public Order() {
    	products = new LinkedList<>();
    }
    
    public void removeProduct(Product product) {
    	products.remove(product);
    }
    
    public int calculateTotalCost() {
    	int sum = 0;
    	for(Product product : products)
    		sum += product.getPrice();
    	return sum;
    }
    
    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", products=" + products +
                '}';
    }
}
