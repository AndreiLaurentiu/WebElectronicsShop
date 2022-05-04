package products;

public class BasicUser extends User{
	private int idBasicUser;
    

    public BasicUser(int id, String name, String password, String emailAddress) {
        super(id, name, password, emailAddress);
    	this.idBasicUser = idBasicUser;
        
    }
}
