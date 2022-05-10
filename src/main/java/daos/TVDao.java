package daos;

import java.util.LinkedList;

import models.TV;

public class TVDao {
private LinkedList<TV> listTVs = new LinkedList<>();
	
	public void save(TV tv) {
        listTVs.add(tv);
    }
	
	public void delete(int index) {
		listTVs.remove(index);
	}
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "price":
			listTVs.get(index).setPrice(Integer.parseInt(newValue));
			break;
		case "name":
			listTVs.get(index).setProductName(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public LinkedList<TV> getAll() {
        return listTVs;
    }
}
