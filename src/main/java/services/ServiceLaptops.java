package services;

import java.util.Comparator;



import java.util.LinkedList;

import daos.LaptopDao;
import models.Laptop;

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
		laptopdao.delete(index);
    }
	
	public void removeLaptopByName(String name) {
		LinkedList<Laptop> laptops = laptopdao.getAll();
    	for(Laptop laptop : laptops)
        	if(laptop.getProductName().equals(name))
        		laptopdao.delete(laptops.indexOf(laptop));
    }
	
    public void removeLaptopByBrand(String brand) {
    	LinkedList<Laptop> laptops = laptopdao.getAll();
    	for(Laptop laptop : laptops)
        	if(laptop.getBrand().equals(brand))
        		laptopdao.delete(laptops.indexOf(laptop));
    }
    
   public void printListLaptopsByBrand() {
	   laptopdao.getAll().stream()
	.sorted(Comparator.comparing(Laptop::getBrand))
	.forEach(System.out::println);
   }
   
   public void updatePriceByName(String name, int newPrice) {
	    LinkedList<Laptop> laptops = laptopdao.getAll();
  		for(Laptop laptop : laptops)
  			if(laptop.getProductName().equals(name))
  				laptopdao.update(laptops.indexOf(laptop), "price", Integer.toString(newPrice));
  }
  
  public void updateProductNameByName(String name, String newProductName) {
	    LinkedList<Laptop> laptops = laptopdao.getAll();
 		for(Laptop laptop : laptops)
 			if(laptop.getProductName().equals(name))
 				laptopdao.update(laptops.indexOf(laptop), "name", newProductName);
 }
    
    public LinkedList<Laptop> getArrayOfLaptops(){
    	return laptopdao.getAll();
    }
    
}
