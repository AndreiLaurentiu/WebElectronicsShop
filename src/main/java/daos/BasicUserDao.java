package daos;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import models.BasicUser;

public class BasicUserDao {
private TreeSet<BasicUser> setBasicUsers = new TreeSet<>();
	
	public void save(BasicUser basicuser) {
        setBasicUsers.add(basicuser);
    }
	
	public void delete(BasicUser basicuser) {
		setBasicUsers.remove(basicuser);
	}
	
	public void update(int index, String attribute, String newValue) {
		List<BasicUser> users = new ArrayList<>(setBasicUsers.size());
		Collections.addAll(users, (BasicUser[])setBasicUsers.toArray());
		
		switch(attribute) {
		
		case "username":
			users.get(index).setUsername(newValue);
			break;
		case "email":
			users.get(index).setEmail(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public TreeSet<BasicUser> getAll() {
        return setBasicUsers;
    }

}
