package daos;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.TV;

public class TVDao {
private LinkedList<TV> listTVs = new LinkedList<>();
	
	public void save(TV tv) {
        listTVs.add(tv);
    }
	
	public void deleteByIndex(int index) {
		listTVs.remove(index);
	}
	
	public void deleteTVByBrand(String brand) {
        Predicate<TV> filter = (TV b) -> (b.getBrand().equalsIgnoreCase(brand));
        listTVs.removeIf(filter);
    }
	
	public LinkedList<TV> getAll() {
        return listTVs;
    }
}
