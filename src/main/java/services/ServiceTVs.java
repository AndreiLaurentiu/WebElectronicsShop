package services;

import java.util.Comparator;



import java.util.LinkedList;


import daos.TVDao;
import models.TV;

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
		tvdao.delete(index);
    }
	
	public void removeTVByBrand(String brand) {
    	LinkedList<TV> tvs = tvdao.getAll();
    	for(TV tv : tvs)
        	if(tv.getBrand().equals(brand))
        		tvdao.delete(tvs.indexOf(tv));
    }
    
    public void removeTVByName(String name) {
    	LinkedList<TV> tvs = tvdao.getAll();
    	for(TV tv : tvs)
        	if(tv.getProductName().equals(name))
        		tvdao.delete(tvs.indexOf(tv));
    }
    
   public void printListTVsByBrand() {
	   tvdao.getAll().stream()
	.sorted(Comparator.comparing(TV::getBrand))
	.forEach(System.out::println);
   }
   
   public void updatePriceByName(String name, int newPrice) {
	    LinkedList<TV> tvs = tvdao.getAll();
  		for(TV tv : tvs)
  			if(tv.getProductName().equals(name))
  				tvdao.update(tvs.indexOf(tv), "price", Integer.toString(newPrice));
  }
  
  public void updateProductNameByName(String name, String newProductName) {
	    LinkedList<TV> tvs = tvdao.getAll();
 		for(TV tv : tvs)
 			if(tv.getProductName().equals(name))
 				tvdao.update(tvs.indexOf(tv), "name", newProductName);
 }
    
   public LinkedList<TV> getTVs(){
	   return tvdao.getAll();
    }
}
