package daos;

import java.util.LinkedList;

import models.Admin;

public class AdminDao {
private LinkedList<Admin> listAdmins = new LinkedList<>();
	
	public void save(Admin admin) {
        listAdmins.add(admin);
    }
	
	public void delete(int index) {
		listAdmins.remove(index);
	}
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "name":
			listAdmins.get(index).setUsername(newValue);
			break;
		case "email":
			listAdmins.get(index).setEmail(newValue);
			break;
		default:
			System.out.println("Nothing to update");
			break;
		}
		
	}
	
	public LinkedList<Admin> getAll() {
        return listAdmins;
    }
}
