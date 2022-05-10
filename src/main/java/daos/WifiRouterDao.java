package daos;

import java.util.LinkedList;

import models.WifiRouter;

public class WifiRouterDao {
private LinkedList<WifiRouter> listWifis = new LinkedList<>();
	
	public void save(WifiRouter wifi) {
		listWifis.add(wifi);
    }
	
	public void delete(int index) {
		listWifis.remove(index);
	}
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "price":
			listWifis.get(index).setPrice(Integer.parseInt(newValue));
			break;
		case "name":
			listWifis.get(index).setProductName(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public LinkedList<WifiRouter> getAll() {
        return listWifis;
    }

}
