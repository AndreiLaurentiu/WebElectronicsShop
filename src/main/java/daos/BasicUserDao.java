package daos;

import java.util.LinkedList;
import java.util.function.Predicate;

import products.BasicUser;

public class BasicUserDao {
private LinkedList<BasicUser> listBasicUsers = new LinkedList<>();
	
	public void save(BasicUser basicuser) {
        listBasicUsers.add(basicuser);
    }
	
	public void deleteByIndex(int index) {
		listBasicUsers.remove(index);
	}
	
	public void deleteBasicUserByName(String brand) {
        Predicate<BasicUser> filter = (BasicUser b) -> (b.getUsername().equalsIgnoreCase(brand));
        listBasicUsers.removeIf(filter);
    }
	
	public LinkedList<BasicUser> getAll() {
        return listBasicUsers;
    }

}
