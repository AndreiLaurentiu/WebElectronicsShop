package services;

import java.util.Comparator;

import java.util.LinkedList;

import daos.PhoneDao;
import models.Phone;

public class ServicePhones {
private PhoneDao phonedao = new PhoneDao();
	
	
	public void addPhone(Phone phone) {
		phonedao.save(phone);
    }
	
	public void printListPhones() {
		phonedao.getAll().forEach(System.out::println);
    }
	
	public void printListPhonesByPrice() {
		phonedao.getAll().stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removePhoneByIndex(int index) {
		phonedao.delete(index);
    }
	
    public void removePhoneByBrand(String brand) {
    	LinkedList<Phone> phones = phonedao.getAll();
    	for(Phone phone : phones)
        	if(phone.getBrand().equals(brand))
        		phonedao.delete(phones.indexOf(phone));
    }
    
    public void removePhoneByName(String name) {
    	LinkedList<Phone> phones = phonedao.getAll();
    	for(Phone phone : phones)
        	if(phone.getProductName().equals(name))
        		phonedao.delete(phones.indexOf(phone));
    }
    
   public void printListPhonesByBrand() {
	   phonedao.getAll().stream()
	.sorted(Comparator.comparing(Phone::getBrand))
	.forEach(System.out::println);
   }
   
   public void updatePriceByName(String name, int newPrice) {
	    LinkedList<Phone> phones = phonedao.getAll();
   		for(Phone phone : phones)
   			if(phone.getProductName().equals(name))
   				phonedao.update(phones.indexOf(phone), "price", Integer.toString(newPrice));
   }
   
   public void updateProductNameByName(String name, String newProductName) {
	    LinkedList<Phone> phones = phonedao.getAll();
  		for(Phone phone : phones)
  			if(phone.getProductName().equals(name))
  				phonedao.update(phones.indexOf(phone), "name", newProductName);
  }
    
    public LinkedList<Phone> getPhones(){
    	return phonedao.getAll();
    }
    
}