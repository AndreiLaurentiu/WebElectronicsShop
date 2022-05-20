package services;

import java.util.Comparator;
import java.util.LinkedList;

import daos.OrderDao;
import models.Courier;
import models.Order;
import models.Product;

public class ServiceOrder {
	
	private OrderDao orderDao = new OrderDao();
	
	public void addOrder(Order Order) {
		orderDao.save(Order);
    }
	
	public void printListOrders() {
		orderDao.getAll().forEach(System.out::println);
    }
	
	public void removeOrderByIndex(int index) {
		orderDao.delete(index);
    }
    
   public LinkedList<Order> getTVs(){
	   return orderDao.getAll();
	   }
    
   
   
}
