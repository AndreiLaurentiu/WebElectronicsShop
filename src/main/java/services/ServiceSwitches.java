package services;

import java.util.Comparator;
import java.util.LinkedList;

import daos.SwitchDao;
import products.Switch;

public class ServiceSwitches {
	
	
	private SwitchDao switchdao = new SwitchDao();


	public void addLaptop(Switch Switch) {
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

	public void removeSwitchByIndex(int index) {
		switchdao.deleteByIndex(index);
	}
	public void removeSwitchByBrand(String brand) {
		switchdao.deleteSwitchByBrand(brand);
	}

	public void printListSwitchesByBrand() {
		switchdao.getAll().stream()
		.sorted(Comparator.comparing(Switch::getBrand))
		.forEach(System.out::println);
	}

	public LinkedList<Switch> getArrayOfSwitches(){
		return switchdao.getAll();
	}


}
