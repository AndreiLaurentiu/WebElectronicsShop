package services;

import java.util.LinkedList;

import java.util.function.Predicate;

import daos.WifiRouterDao;
import products.WifiRouter;

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
		wifidao.deleteByIndex(index);
    }
    public void removeWifiRouterByBrand(String brand) {
    	wifidao.deleteWifiRouterByBrand(brand);
    }
    
    public LinkedList<WifiRouter> getArrayOfWifiRouters(){
    	return wifidao.getAll();
    }
}
