package services;

import java.io.IOException;
import java.util.Comparator;


import java.util.LinkedList;

import csvs.Log;
import daos.SwitchDao;
import models.Switch;

public class ServiceSwitches {
	
	
	private SwitchDao switchdao = new SwitchDao();


	public void addSwitch(Switch Switch) throws IOException {
		Log.log("Adding switch: " + Switch.getProductName());
		switchdao.save(Switch);
	}

	public void printListSwitches() {
		switchdao.getAll().forEach(System.out::println);
	}

	public void printListSwitchesByPrice() {
		switchdao.getAll().stream()
            .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
            .forEach(System.out::println);
	}

	public void removeSwitchByBrand(String brand) {
		LinkedList<Switch> switches = switchdao.getAll();
  		for(Switch Switch : switches)
  			if(Switch.getProductName().equals(brand))
        		switchdao.delete(switches.indexOf(Switch));
    }
    
    public void removeSwitchByName(String name) throws IOException {
    	Log.log("Removing switch: " + name);
    	LinkedList<Switch> switches = switchdao.getAll();
  		for(Switch Switch : switches)
  			if(Switch.getProductName().equals(name))
        		switchdao.delete(switches.indexOf(Switch));
    }

	public void printListSwitchesByBrand() {
		switchdao.getAll().stream()
		.sorted(Comparator.comparing(Switch::getBrand))
		.forEach(System.out::println);
	}

	public void updatePriceByName(String name, int newPrice) {
	    LinkedList<Switch> switches = switchdao.getAll();
   		for(Switch Switch : switches)
   			if(Switch.getProductName().equals(name))
   				switchdao.update(switches.indexOf(Switch), "price", Integer.toString(newPrice));
   }
   
   public void updateProductNameByName(String name, String newProductName) {
	    LinkedList<Switch> switches = switchdao.getAll();
  		for(Switch Switch : switches)
  			if(Switch.getProductName().equals(name))
  				switchdao.update(switches.indexOf(Switch), "name", newProductName);
  }
	
	public LinkedList<Switch> getSwitches(){
		return switchdao.getAll();
	}


}
