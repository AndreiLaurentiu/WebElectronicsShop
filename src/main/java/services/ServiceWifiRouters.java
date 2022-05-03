package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.WifiRouter;

public class ServiceWifiRouters {
LinkedList<WifiRouter> listWifiRouters = new LinkedList<>();
	
	
	public void addWifiRouter(WifiRouter WifiRouter) {
        listWifiRouters.add(WifiRouter);
    }
	
	public void printListWifiRouters() {
        listWifiRouters.forEach(System.out::println);
    }
	
	public void printListWifiRoutersByPrice() {
        listWifiRouters.stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removeWifiRouterByIndex(int i) {
        listWifiRouters.remove(i);
    }
    public void removeWifiRouterByBrand(String brand) {
        Predicate<WifiRouter> filter = (WifiRouter b) -> (b.getBrand().equalsIgnoreCase(brand));
        listWifiRouters.removeIf(filter);
    }
    
    public LinkedList<WifiRouter> getArrayOfWifiRouters(){
    	return listWifiRouters;
    }
}
