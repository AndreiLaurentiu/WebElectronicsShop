package daos;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.Laptop;

public class LaptopDao {
	private LinkedList<Laptop> listLaptops = new LinkedList<>();
	
	public void save(Laptop laptop) {
        listLaptops.add(laptop);
    }
	
	public void deleteByIndex(int index) {
		listLaptops.remove(index);
	}
	
	public void deleteLaptopByBrand(String brand) {
        Predicate<Laptop> filter = (Laptop b) -> (b.getBrand().equalsIgnoreCase(brand));
        listLaptops.removeIf(filter);
    }
	
	public LinkedList<Laptop> getAll() {
        return listLaptops;
    }

}
