package products;

public class BasicUser extends User{
	private int idBasicUser;
    

    public BasicUser(int idAdmin, String name, String password, String emailAddress) {
        super(idAdmin, name, password, emailAddress);
    	this.idBasicUser = idBasicUser;
        
    }
}
