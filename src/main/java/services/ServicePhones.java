package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.Phone;

public class ServicePhones {
	LinkedList<Phone> listPhones = new LinkedList<>();
	
	
	public void addPhone(Phone phone) {
        listPhones.add(phone);
    }
	
	public void printListPhones() {
        listPhones.forEach(System.out::println);
    }
	
	public void printListPhonesByPrice() {
        listPhones.stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removePhoneByIndex(int i) {
        listPhones.remove(i);
    }
    public void removePhoneByBrand(String brand) {
        Predicate<Phone> filter = (Phone b) -> (b.getBrand().equalsIgnoreCase(brand));
        listPhones.removeIf(filter);
    }
    
    public LinkedList<Phone> getArrayOfPhones(){
    	return listPhones;
    }
    
}