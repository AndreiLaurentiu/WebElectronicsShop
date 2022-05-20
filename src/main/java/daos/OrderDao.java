package daos;

import java.util.LinkedList;

import models.Order;

public class OrderDao {
	private LinkedList<Order> listOrders = new LinkedList<>();
	
	public void save(Order Order) {
        listOrders.add(Order);
    }
	
	public void delete(int index) {
		listOrders.remove(index);
	}
	
	public LinkedList<Order> getAll() {
        return listOrders;
    }

}

