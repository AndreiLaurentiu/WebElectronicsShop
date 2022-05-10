package daos;

import java.util.LinkedList;

import models.Phone;

public class PhoneDao {
private LinkedList<Phone> listPhones = new LinkedList<>();
	
	public void save(Phone phone) {
        listPhones.add(phone);
    }
	
	public void delete(int index) {
		listPhones.remove(index);
	}
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "price":
			listPhones.get(index).setPrice(Integer.parseInt(newValue));
			break;
		case "name":
			listPhones.get(index).setProductName(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public LinkedList<Phone> getAll() {
        return listPhones;
    }

}
