package daos;

import java.util.LinkedList;

import models.Switch;

public class SwitchDao {
private LinkedList<Switch> listSwitches = new LinkedList<>();
	
	public void save(Switch Switch) {
        listSwitches.add(Switch);
    }
	
	public void delete(int index) {
		listSwitches.remove(index);
	}
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "price":
			listSwitches.get(index).setPrice(Integer.parseInt(newValue));
			break;
		case "name":
			listSwitches.get(index).setProductName(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public LinkedList<Switch> getAll() {
        return listSwitches;
    }

}
