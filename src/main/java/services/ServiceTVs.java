package services;

import java.util.Comparator;

import java.util.LinkedList;
import java.util.function.Predicate;

import daos.TVDao;
import products.TV;

public class ServiceTVs {
	private TVDao tvdao = new TVDao();
	
	
	public void addTV(TV tv) {
        tvdao.save(tv);
    }
	
	public void printListTVs() {
        tvdao.getAll().forEach(System.out::println);
    }
	
	public void printListTVsByPrice() {
		tvdao.getAll().stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removeTVByIndex(int index) {
		tvdao.deleteByIndex(index);
    }
    public void removeTVByBrand(String brand) {
        tvdao.deleteTVByBrand(brand);
    }
    
   public void printListTVsByBrand() {
	   tvdao.getAll().stream()
	.sorted(Comparator.comparing(TV::getBrand))
	.forEach(System.out::println);
   }
    
    public LinkedList<TV> getTVs(){
    	return tvdao.getAll();
    }
}
