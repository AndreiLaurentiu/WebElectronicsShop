package services;

import java.util.LinkedList;

import daos.OrderDao;
import models.Order;

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
    
   public LinkedList<Order> getOrders(){
	   return orderDao.getAll();
	   }
    
   
   
}
