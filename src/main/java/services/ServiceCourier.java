package services;

import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;

import csvs.Log;
import daos.CourierDao;
import models.Courier;
import models.Laptop;

public class ServiceCourier {
	
	// 10/12/2022
	public boolean acceptDelivery(String date){
        int[] dateFormat = new int[3];
        String[] string = date.split("/");
        for(int i=0; i<2; i++)
            dateFormat[i] = Integer.parseInt(string[i]);
        //TODO: trebuie facuta o verificare la nivelul bazei de date daca este liber curierul
        return true;

    }
	
	private CourierDao courierDao = new CourierDao();
	
	
	public void addCourier(Courier courier) throws IOException {
		Log.log("Adding courier: " + courier.getUsername());
		courierDao.save(courier);
    }
	
	public void printListCouriers() {
		courierDao.getAll().forEach(System.out::println);
    }
	
	public void printListCouriersByName() {
		courierDao.getAll().stream()
                .sorted((p1,p2) -> p1.getUsername().compareTo(p2.getUsername()))
                .forEach(System.out::println);
    }
	
	public void removeCourierByIndex(int index) {
		courierDao.delete(index);
    }
	
	public void removeCourierByName(String name) throws IOException {
		 Log.log("Removing courier: " + name);
		LinkedList<Courier> couriers = courierDao.getAll();
    	for(Courier courier : couriers)
        	if(courier.getUsername().equals(name))
        		courierDao.delete(couriers.indexOf(courier));
    }
	
   
   public void updateEmailByName(String name, int newEmail) {
	    LinkedList<Courier> couriers = courierDao.getAll();
  		for(Courier courier : couriers)
  			if(courier.getUsername().equals(name))
  				courierDao.update(couriers.indexOf(courier), "email", Integer.toString(newEmail));
  }
  
  public void updateUsernameByName(String name, String newUsername) {
	    LinkedList<Courier> couriers = courierDao.getAll();
 		for(Courier courier : couriers)
 			if(courier.getUsername().equals(name))
 				courierDao.update(couriers.indexOf(courier), "name", newUsername);
 }
    
    public LinkedList<Courier> getArrayOfLaptops(){
    	return courierDao.getAll();
    }

}
