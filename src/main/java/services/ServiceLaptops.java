package services;

import java.util.Comparator;

import java.util.LinkedList;

import daos.LaptopDao;
import products.Laptop;

public class ServiceLaptops {
	private LaptopDao laptopdao = new LaptopDao();
	
	
	public void addLaptop(Laptop laptop) {
        laptopdao.save(laptop);
    }
	
	public void printListLaptops() {
        laptopdao.getAll().forEach(System.out::println);
    }
	
	public void printListLaptopsByPrice() {
		laptopdao.getAll().stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removeLaptopByIndex(int index) {
		laptopdao.deleteByIndex(index);
    }
    public void removeLaptopByBrand(String brand) {
        laptopdao.deleteLaptopByBrand(brand);
    }
    
   public void printListLaptopsByBrand() {
	   laptopdao.getAll().stream()
	.sorted(Comparator.comparing(Laptop::getBrand))
	.forEach(System.out::println);
   }
    
    public LinkedList<Laptop> getArrayOfLaptops(){
    	return laptopdao.getAll();
    }
    
}
