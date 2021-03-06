package services;

import java.io.IOException;
import java.util.Comparator;

import java.util.TreeSet;

import csvs.Log;
import daos.BasicUserDao;
import daos.CourierDao;
import models.BasicUser;
import models.Courier;
import models.Order;
import models.Product;

public class ServiceBasicUser {
	private BasicUserDao basicuserdao = new BasicUserDao();
	private ServiceCourier courierService = new ServiceCourier();
	
	public void addBasicUser(BasicUser user) throws IOException {
		Log.log("Adding basic user: " + user.getUsername());
		basicuserdao.save(user);
    }
	
	public void printListBasicUsers() {
		basicuserdao.getAll().forEach(System.out::println);
    }
	
    public void removeBasicUserByName(String username) throws IOException {
    	Log.log("Removing user: " + username);
    	TreeSet<BasicUser> basicUsers = basicuserdao.getAll();
    	for(BasicUser basicUser : basicUsers)
        	if(basicUser.getUsername().equals(username))
        		basicuserdao.delete(basicUser);
    }
    
   public void printListBasicUsersByName() {
	   basicuserdao.getAll().stream()
	.sorted(Comparator.comparing(BasicUser::getUsername))
	.forEach(System.out::println);
   }
   
   public void updateEmailByName(String name, String newEmail) {
	    TreeSet<BasicUser> basicUsers = basicuserdao.getAll();
	    int counter = 0;
 		for(BasicUser basicUser : basicUsers) {
 			if(basicUser.getUsername().equals(name))
 				basicuserdao.update(counter, "email", newEmail);
 			counter++;
 		}
 }
 
 public void updateUsernameByName(String name, String newUsername) {
	    TreeSet<BasicUser> basicusers = basicuserdao.getAll();
	    int counter = 0;
		for(BasicUser basicUser : basicusers) {
			if(basicUser.getUsername().equals(name))
				basicuserdao.update(counter, "name", newUsername);
			counter++;
		}
}
    
    public TreeSet<BasicUser> getBasicUsers(){
    	return basicuserdao.getAll();
    }
    
//    public void addProductInOrder(Order order, Product product){
//        order.addProduct(product);
//    }
//
//    public void chooseDeliveryService(Courier courier, String deliveryDate){
//        if(courier.acceptDelivery(deliveryDate))
//            System.out.println("Comanda a fost plasata cu succes.");
//        else
//            System.out.println("Va rugam introduceti alta data.");
//    }
}
