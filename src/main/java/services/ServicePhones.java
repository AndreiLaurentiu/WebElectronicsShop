package services;

import java.util.Comparator;

import java.util.LinkedList;
import java.util.function.Predicate;

import daos.PhoneDao;
import products.Phone;

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
		phonedao.deleteByIndex(index);
    }
    public void removePhoneByBrand(String brand) {
    	phonedao.deleteByBrand(brand);
    }
    
   public void printListPhonesByBrand() {
	   phonedao.getAll().stream()
	.sorted(Comparator.comparing(Phone::getBrand))
	.forEach(System.out::println);
   }
    
    public LinkedList<Phone> getPhones(){
    	return phonedao.getAll();
    }
    
}