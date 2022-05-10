package daos;

import java.util.ArrayList;

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
		List<BasicUser> list = new ArrayList<BasicUser> (this.setBasicUsers);
		
		switch(attribute) {
		
		case "username":
			list.get(index).setUsername(newValue);
			break;
		case "email":
			list.get(index).setEmail(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
		this.setBasicUsers = new TreeSet<BasicUser>(list);
	}
	
	public TreeSet<BasicUser> getAll() {
        return setBasicUsers;
    }

}
