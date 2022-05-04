package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.Laptop;

public class ServiceLaptops {
	LinkedList<Laptop> listLaptops = new LinkedList<>();
	
	
	public void addLaptop(Laptop laptop) {
        listLaptops.add(laptop);
    }
	
	public void printListLaptops() {
        listLaptops.forEach(System.out::println);
    }
	
	public void printListLaptopsByPrice() {
        listLaptops.stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removeLaptopByIndex(int i) {
        listLaptops.remove(i);
    }
    public void removeLaptopByBrand(String brand) {
        Predicate<Laptop> filter = (Laptop b) -> (b.getBrand().equalsIgnoreCase(brand));
        listLaptops.removeIf(filter);
    }
    
//    public void printListLaptopsByBrand() {
//        listLaptops.stream()
//                .sorted((p1,p2) -> p1.getBrand().equals(p2.getBrand()))
//                .forEach(System.out::println);
//    }
    
    public LinkedList<Laptop> getArrayOfLaptops(){
    	return listLaptops;
    }
    
}
