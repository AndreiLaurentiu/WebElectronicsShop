package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.Switch;

public class ServiceSwitches {
LinkedList<Switch> listSwitchs = new LinkedList<>();
	
	
	public void addSwitch(Switch Switch) {
        listSwitchs.add(Switch);
    }
	
	public void printListSwitchs() {
        listSwitchs.forEach(System.out::println);
    }
	
	public void printListSwitchsByPrice() {
        listSwitchs.stream()
                .sorted((p1,p2) -> p1.getPrice() - p2.getPrice())
                .forEach(System.out::println);
    }
	
	public void removeSwitchByIndex(int i) {
        listSwitchs.remove(i);
    }
    public void removeSwitchByBrand(String brand) {
        Predicate<Switch> filter = (Switch b) -> (b.getBrand().equalsIgnoreCase(brand));
        listSwitchs.removeIf(filter);
    }
    
    public LinkedList<Switch> getArrayOfPhones(){
    	return listSwitchs;
    }

}
