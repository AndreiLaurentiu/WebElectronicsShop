package daos;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.WifiRouter;

public class WifiRouterDao {
private LinkedList<WifiRouter> listWifis = new LinkedList<>();
	
	public void save(WifiRouter wifi) {
		listWifis.add(wifi);
    }
	
	public void deleteByIndex(int index) {
		listWifis.remove(index);
	}
	
	public void deleteWifiRouterByBrand(String brand) {
        Predicate<WifiRouter> filter = (WifiRouter b) -> (b.getBrand().equalsIgnoreCase(brand));
        listWifis.removeIf(filter);
    }
	
	public LinkedList<WifiRouter> getAll() {
        return listWifis;
    }

}
