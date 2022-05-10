package daos;

import java.util.LinkedList;

import models.Laptop;

public class LaptopDao {
	private LinkedList<Laptop> listLaptops = new LinkedList<>();
	
	public void save(Laptop laptop) {
        listLaptops.add(laptop);
    }
	
	public void delete(int index) {
		listLaptops.remove(index);
	}
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "price":
			listLaptops.get(index).setPrice(Integer.parseInt(newValue));
			break;
		case "name":
			listLaptops.get(index).setProductName(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public LinkedList<Laptop> getAll() {
        return listLaptops;
    }

}
