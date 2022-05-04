package daos;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.Phone;

public class PhoneDao {
private LinkedList<Phone> listPhones = new LinkedList<>();
	
	public void save(Phone phone) {
        listPhones.add(phone);
    }
	
	public void deleteByIndex(int index) {
		listPhones.remove(index);
	}
	
	public void deleteByBrand(String brand) {
        Predicate<Phone> filter = (Phone b) -> (b.getBrand().equalsIgnoreCase(brand));
        listPhones.removeIf(filter);
    }
	
	public LinkedList<Phone> getAll() {
        return listPhones;
    }

}
