package products;

import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class Admin extends User{
    private int idAdmin;
    

    public Admin(int idAdmin, String name, String password, String emailAddress) {
        super(idAdmin, name, password, emailAddress);
    	this.idAdmin = idAdmin;
        
    }
    
    public BasicUser createBasicUser() {
    	//TODO: here I will fetch the info from the web interface
    	BasicUser user = new BasicUser(15, "emailAddress", "emailAddress", "emailAddress");
    	return user;
    }
    
    public void deleteUserByName(String name, HashSet<BasicUser> listOfUsers) {
    	Predicate<BasicUser> filter = (BasicUser b) -> (b.getUsername().equalsIgnoreCase(name));
    	listOfUsers.removeIf(filter);
    }
    
    //TODO: add methods for CRUD on products
    
}
