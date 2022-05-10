package services;

import java.util.LinkedList;


import daos.WifiRouterDao;
import models.WifiRouter;

public class ServiceWifiRouters {
	private WifiRouterDao wifidao = new WifiRouterDao();
	
	
	public void addWifiRouter(WifiRouter wifirouter) {
		wifidao.save(wifirouter);
    }
	
	public void printListWifiRouters() {
		wifidao.getAll().forEach(System.out::println);
    }
	
	public void printListWifiRoutersByPrice() {
		wifidao.getAll().stream()
        .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
        .forEach(System.out::println);
    }
	
	public void removeWifiRouterByIndex(int index) {
		wifidao.delete(index);
    }
	
	public void removeWifiRouterByBrand(String brand) {
    	LinkedList<WifiRouter> wifis = wifidao.getAll();
    	for(WifiRouter wifi : wifis)
        	if(wifi.getBrand().equals(brand))
        		wifidao.delete(wifis.indexOf(wifi));
    }
    
    public void removeWifiRouterByName(String name) {
    	LinkedList<WifiRouter> wifis = wifidao.getAll();
    	for(WifiRouter wifi : wifis)
        	if(wifi.getProductName().equals(name))
        		wifidao.delete(wifis.indexOf(wifi));
    }
    
    public void updatePriceByName(String name, int newPrice) {
	    LinkedList<WifiRouter> wifis = wifidao.getAll();
  		for(WifiRouter wifi : wifis)
  			if(wifi.getProductName().equals(name))
  				wifidao.update(wifis.indexOf(wifi), "price", Integer.toString(newPrice));
  }
  
  public void updateProductNameByName(String name, String newProductName) {
	    LinkedList<WifiRouter> wifis = wifidao.getAll();
 		for(WifiRouter wifi : wifis)
 			if(wifi.getProductName().equals(name))
 				wifidao.update(wifis.indexOf(wifi), "name", newProductName);
 }
    
    public LinkedList<WifiRouter> getWifiRouters(){
    	return wifidao.getAll();
    }
}
