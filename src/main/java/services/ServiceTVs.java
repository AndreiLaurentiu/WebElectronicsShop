package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.TV;

public class ServiceTVs {
LinkedList<TV> listTVs = new LinkedList<>();
	
	
	public void addSwitch(TV TV) {
        listTVs.add(TV);
    }
	
	public void printListTVs() {
        listTVs.forEach(System.out::println);
    }
	
	public void printListTVsByPrice() {
        listTVs.stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removeTVByIndex(int i) {
        listTVs.remove(i);
    }
    public void removeTVByBrand(String brand) {
        Predicate<TV> filter = (TV b) -> (b.getBrand().equalsIgnoreCase(brand));
        listTVs.removeIf(filter);
    }
    
    public LinkedList<TV> getArrayOfPhones(){
    	return listTVs;
    }
}
