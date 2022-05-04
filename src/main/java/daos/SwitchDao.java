package daos;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.Switch;

public class SwitchDao {
private LinkedList<Switch> listSwitches = new LinkedList<>();
	
	public void save(Switch Switch) {
        listSwitches.add(Switch);
    }
	
	public void deleteByIndex(int index) {
		listSwitches.remove(index);
	}
	
	public void deleteSwitchByBrand(String brand) {
        Predicate<Switch> filter = (Switch b) -> (b.getBrand().equalsIgnoreCase(brand));
        listSwitches.removeIf(filter);
    }
	
	public LinkedList<Switch> getAll() {
        return listSwitches;
    }

}
