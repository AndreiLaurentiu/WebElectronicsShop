package models;

import java.util.LinkedList;

public class Order {
    private int idOrder;
    private LinkedList<Product> products;
    private Courier courier;

    public Order(int idOrder, LinkedList<Product> products, Courier courier) {
    	this.idOrder = idOrder;
        this.products = products;
        this.setCourier(courier);
    }
    
    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", products=" + products +
                '}';
    }

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public LinkedList<Product> getProducts() {
		return products;
	}

	public void setProducts(LinkedList<Product> products) {
		this.products = products;
	}

	public int getIdOrder() {
		return idOrder;
	}
	
	public void addProductInOrderById(Product product, int index){
        products.add(product);
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
	
}
