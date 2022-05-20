package daos;

import java.util.LinkedList;

import models.Courier;

public class CourierDao {
private LinkedList<Courier> listCouriers = new LinkedList<>();
	
	public void save(Courier Courier) {
        listCouriers.add(Courier);
    }
	
	public void delete(int index) {
		listCouriers.remove(index);
	}
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "username":
			listCouriers.get(index).setUsername(newValue);
			break;
		case "phone number":
			listCouriers.get(index).setCellPhoneNumber(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public LinkedList<Courier> getAll() {
        return listCouriers;
    }

}
